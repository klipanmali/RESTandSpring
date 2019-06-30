package com.example.spring5andrest.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring5andrest.mail.MailSender;
import com.example.spring5andrest.mail.MockMailSender;

@RestController
public class MailController {

	private MailSender mailSender = new MockMailSender();

	@RequestMapping("/mail")
	public String hello() {

		mailSender.send("mail@example.com", "A test mail",
				"Body of a test mail");

		return "Mail sent";
	}

}
