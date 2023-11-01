package com.example.lab7springsecurity1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class Lab7SpringSecurity1Application {

    public static void main(String[] args) {
        SpringApplication.run(Lab7SpringSecurity1Application.class, args);
    }

}
