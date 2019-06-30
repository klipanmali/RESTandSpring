package com.example.spring5andrest.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring5andrest.mail.MailSender;

@RestController
public class MailController {

	// @Autowired
	private MailSender mailSender;

	// @Autowired // methods can be annotated too
	public void someMethod(MailSender mailSender) {
		this.mailSender = mailSender;
	}

	// @Autowired // single constructor desn't have to be annotated, it is the
	// only constructor
	public MailController(MailSender mailSender) {
		this.mailSender = mailSender;
	}

	@RequestMapping("/mail")
	public String hello() {

		mailSender.send("mail@example.com", "A test mail",
				"Body of a test mail");

		return "Mail sent";
	}

}
