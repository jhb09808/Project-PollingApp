package com.example.pollingapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;

@SpringBootApplication
@EnableMethodSecurity
public class PollingappApplication {

    public static void main(String[] args) {
        SpringApplication.run(PollingappApplication.class, args);
    }
}