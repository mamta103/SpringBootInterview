package com.java4s.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootApp extends SpringBootServletInitializer {

	@Override
	public SpringApplicationBuilder configure(SpringApplicationBuilder application)
	{
		
		return application.sources(SpringBootApp.class);
		
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootApp.class, args);
		
	}

}
