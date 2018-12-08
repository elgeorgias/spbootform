package com.in28minutes.springboot.studentservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentServicesApplication {

	public static void main(String[] args) {
		System.out.println("Starting Web Spring Boot");
		SpringApplication.run(StudentServicesApplication.class, args);
	}
}
