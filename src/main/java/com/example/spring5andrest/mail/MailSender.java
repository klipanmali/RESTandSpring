package com.example.spring5andrest.mail;

public interface MailSender {
	void send(String to, String subject, String body);
}
