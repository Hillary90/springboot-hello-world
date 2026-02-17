package com.moringa.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args);
        System.out.println("\nSpring Boot Hello World API is running!");
        System.out.println("Visit: http://localhost:8080/hello\n");
    }
}
