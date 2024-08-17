package com.example.demo.controller;



import java.util.Properties;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.RegisterModel;
import com.example.demo.services.email;

@RestController
public class EmailController implements email{

    private final JavaMailSender mailSender;

    // Constructor-based dependency injection
    public EmailController() {
        this.mailSender = createJavaMailSender();
    }

//    @PostMapping("/send-email")
    public String sendEmail(@RequestBody RegisterModel emailRequest) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("petchim124@gmail.com");
        message.setTo(emailRequest.getEmail());
        message.setSubject("welcome ");
        message.setText("your member id "+emailRequest.getMemberid());

        mailSender.send(message);

        return "Email sent successfully";
    }

    private JavaMailSender createJavaMailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost("smtp.gmail.com");
        mailSender.setPort(587);
        mailSender.setUsername("petchim124@gmail.com");
        mailSender.setPassword("yvnm ddkx qrvf hlyc");

        Properties props = mailSender.getJavaMailProperties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.debug", "true");

        return mailSender;
    }

	
	
}
