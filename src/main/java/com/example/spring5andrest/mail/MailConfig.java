package com.example.spring5andrest.mail;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;

@Configuration
public class MailConfig {

	// this would be the standard way to inject javaMailSender
	// @Autowired
	// private JavaMailSender javaMailSender;

	@Bean
	// @Profile("dev") // include this bean for profile dev
	// there is no simple way to say if "spring.mail.host" is missing, "foo" is
	// some meaningless value
	@ConditionalOnProperty(name = "spring.mail.host", havingValue = "foo", matchIfMissing = true)
	public MailSender mockMailSender() {
		return new MockMailSender();
	}

	// better way of injecting javaMailSender is to add it as parameter to the
	// method. For @Bean annotated methods, any method parameters are
	// automatically injected by Spring
	@Bean
	// @Profile("!dev") // include this bean for any profile other than dev
	@ConditionalOnProperty("spring.mail.host")
	public MailSender smtpMailSender(JavaMailSender javaMailSender) {
		return new SmtpMailSender(javaMailSender);
	}
}
