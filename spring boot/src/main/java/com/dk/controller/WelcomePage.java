package com.dk.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DingKai
 * @Classname WelcomePage
 * @Description TODO
 * @create 2019/3/8
 */
@RestController
public class WelcomePage {
//    private static final Logger logger = LoggerFactory.getLogger(WelcomePage.class);

    @RequestMapping("/index")
    public String welcome(){
//        logger.info("Welcome Spring Boot!");
        return "index";
    }
}
