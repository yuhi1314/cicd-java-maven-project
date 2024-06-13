package com.helloworld.org;

import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloworldApplication {
    private static final Logger logger = LogManager.getLogger(HelloworldApplication.class);

    public static void main(String[] args) {
        PropertyConfigurator.configure("log4j.properties");
        logger.info("Server started");
        SpringApplication.run(HelloworldApplication.class, args);
    }
}
