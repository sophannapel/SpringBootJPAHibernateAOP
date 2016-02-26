package com.sophanna.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
public class HomeController {
	
	public static void main(String[] args) {
		SpringApplication.run(HomeController.class, args);
	}
}

