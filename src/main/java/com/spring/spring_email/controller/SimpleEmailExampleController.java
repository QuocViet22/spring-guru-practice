package com.spring.spring_email.controller;

import com.spring.spring_email.model.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SimpleEmailExampleController {
    @Autowired
    public JavaMailSender emailSender;

    @RequestMapping("/sendSimpleEmail")
    public String sendSimpleEmail(@RequestBody Email email) {

        // Create a Simple MailMessage.
        SimpleMailMessage message = new SimpleMailMessage();

        message.setTo(email.getName());
        message.setSubject("Test Simple Email");
        message.setText("Hello, Im testing Simple Email");

        // Send Message!
        this.emailSender.send(message);
        return "Email Sent!";
    }
}
