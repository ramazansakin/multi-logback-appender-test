package com.example.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class LoggerDemoApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(LoggerDemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(LoggerDemoApplication.class, args);

        LOGGER.debug("This is debug");
        LOGGER.info("This is information");
        LOGGER.warn("This is warning");
        LOGGER.error("This is error");
    }

}
