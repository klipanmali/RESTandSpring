package com.example.spring5andrest.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
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
	/*
	 * public MailController(MailSender mailSender) { this.mailSender =
	 * mailSender; }
	 */

	// one way to solve the problem of multiple beans is to use bean name as
	// variable name, default one in this case
	/*
	 * public MailController(MailSender smtpMailSender) { this.mailSender =
	 * smtpMailSender; }
	 */

	// multiple beans problem, named bean is used as variable name, unless there
	// is @Primary bean
	/*
	 * public MailController(MailSender smtp) { this.mailSender = smtp; }
	 */

	// multiple beans solution using @Qualifier public
	MailController(@Qualifier("smtpMail") MailSender smtp) {
		this.mailSender = smtp;
	}

	@RequestMapping("/mail")
	public String hello() {

		mailSender.send("mail@example.com", "A test mail",
				"Body of a test mail");

		return "Mail sent";
	}

}
