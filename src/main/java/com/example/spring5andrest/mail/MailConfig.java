package com.example.spring5andrest.mail;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MailConfig {

	@Bean
	// @Profile("dev") // include this bean for profile dev
	// there is no simple way to say if "spring.mail.host" is missing, "foo" is
	// some meaningless value
	@ConditionalOnProperty(name = "spring.mail.host", havingValue = "foo", matchIfMissing = true)
	public MailSender mockMailSender() {
		return new MockMailSender();
	}

	@Bean
	// @Profile("!dev") // include this bean for any profile other than dev
	@ConditionalOnProperty("spring.mail.host")
	public MailSender smtpMailSender() {
		return new SmtpMailSender();
	}
}
