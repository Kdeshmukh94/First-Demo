package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/email")
public class HomeController {
	
	@Autowired
	public JavaMailSender javamailsender;
	@GetMapping("/send")
	public String send()
	{
		SimpleMailMessage m=new SimpleMailMessage();
		m.setTo("swaranshinagulwar.2002@gmail.com");
		m.setSubject("HELLO");
		m.setText("HI HOW ARE YOU");
		
		javamailsender.send(m);
		return "send";
		
	}

}
