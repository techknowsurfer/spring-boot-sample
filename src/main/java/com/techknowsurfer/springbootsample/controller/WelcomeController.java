package com.techknowsurfer.springbootsample.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @RequestMapping(value = "/welcome",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    String home() {
        return "Hello World!";
    }
}
