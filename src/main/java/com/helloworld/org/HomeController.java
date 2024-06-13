package com.helloworld.org;

import org.apache.logging.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    private static final Logger logger = Logger.getLogger(HomeController.class);

    @GetMapping(path = "/", produces = "text/plain")
    public ResponseEntity<String> status() {
        PropertyConfigurator.configure("log4j.properties");
        logger.info("Status check");
        return ResponseEntity.ok("Service is alive");
    }
}
