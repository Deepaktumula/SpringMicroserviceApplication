package com.service.b;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiceBApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceBApplication.class, args);
		System.out.println("--------------------------------");
		System.out.println("Service B Successfully Started...");
		System.out.println("--------------------------------");
	}

}
