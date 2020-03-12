package com.dk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kay
 */

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello Spring Boot.";
    }

    @GetMapping("halo")
    public String halo() {
        return "halo Spring Boot.";
    }

    @RequestMapping("/hi")
    public String hi() {
        return "hi Spring boot.";
    }

    @RequestMapping("h1")
    public String h1() {
        return "h1 Spring Boot.";
    }
}
