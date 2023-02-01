package com.spring_boot_sendemail;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class SpringBootEmailApplication  {
//
//	public static void main(String[] args) {
//		SpringApplication.run(SpringBootEmailApplication.class, args);
//	}
//
//}
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
 
@SpringBootApplication
public class SpringBootEmailApplication implements CommandLineRunner 
{
    @Autowired
    private EmailService emailService;
 
    public static void main(String[] args) {
        SpringApplication.run(SpringBootEmailApplication.class, args);
    }
     
    @Override
    public void run(String... args) 
    {
        emailService.sendMail("vaishnavidongare18@gmail.com", "Happy Coding", "Email sent with demo application");
         
        emailService.sendPreConfiguredMail("Happy Coding");
    }
}