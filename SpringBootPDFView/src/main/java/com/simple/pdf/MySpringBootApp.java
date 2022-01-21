package com.simple.pdf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MySpringBootApp extends SpringBootServletInitializer {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(MySpringBootApp.class, args);
	}
}