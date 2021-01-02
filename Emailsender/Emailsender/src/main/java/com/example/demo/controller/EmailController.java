package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping(value="/email")
public class EmailController {
	
	@Autowired
	public JavaMailSender javamailsender;
	@GetMapping("/send")
	public String send()
	{
		SimpleMailMessage m=new SimpleMailMessage();
		m.setTo("swaranshinagulwar.2002@gmail.com");
		m.setSubject("MAIL SENDER");
		m.setText("ghjkldfghjkfghjkdfgh");
		
		javamailsender.send(m);
		return "send";
		
	}

}
