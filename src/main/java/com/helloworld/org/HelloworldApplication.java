package com.helloworld.org;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloworldApplication {
	private static final Logger logger = LoggerFactory.getLogger(HelloworldApplication.class);

	public static void main(String[] args) {
		logger.info("Server started");
		SpringApplication.run(HelloworldApplication.class, args);
	}
}
