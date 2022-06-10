package com.example.logger.rest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;


@RestController
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
public class RestApiController {

    private static final Logger LOGGER = LoggerFactory.getLogger(RestApiController.class);

    @Autowired
    Environment environment;

    @GetMapping("/test")
    public ResponseEntity<String> apiCheck(@Context HttpServletRequest request, @Context HttpServletResponse response) {
        LOGGER.info("=================== inside API check ===================");

        LOGGER.debug("This is debug");
        LOGGER.info("This is information");
        LOGGER.warn("This is warning");
        LOGGER.error("This is error");

        return ResponseEntity.status(HttpStatus.OK).body("All as well");
    }

}
