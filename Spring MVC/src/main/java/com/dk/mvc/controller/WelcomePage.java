package com.dk.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author DingKai
 * @Classname WelcomePage
 * @Description TODO
 * @create 2019/2/27
 */
@Controller
public class WelcomePage {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String Welcome(){

        return "Welcome.";
    }
}
