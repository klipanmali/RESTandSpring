package com.example.spring5andrest.mail;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class MailConfig {

	@Bean
	@Profile("dev") // include this bean for profile dev
	public MailSender mockMailSender() {
		return new MockMailSender();
	}

	@Bean
	@Profile("!dev") // include this bean for any profile other than dev
	public MailSender smtpMailSender() {
		return new SmtpMailSender();
	}
}
