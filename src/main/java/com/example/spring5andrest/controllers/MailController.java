package com.example.spring5andrest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring5andrest.mail.MailSender;

@RestController
public class MailController {

	@Autowired
	private MailSender mailSender;

	@RequestMapping("/mail")
	public String hello() {

		mailSender.send("mail@example.com", "A test mail",
				"Body of a test mail");

		return "Mail sent";
	}

}
