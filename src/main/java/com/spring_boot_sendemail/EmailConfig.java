package com.spring_boot_sendemail;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.SimpleMailMessage;

@Configuration
public class EmailConfig {
	@Bean
	public SimpleMailMessage emailTemplate()
	{
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo("vaishnavidongare18@gmail.com");
		message.setFrom("vaishnavidongare954@gmail.com");
		message.setSubject("Important email");
	    message.setText("FATAL - Application crash. Save your job !!");
	    return message;
	}
}
