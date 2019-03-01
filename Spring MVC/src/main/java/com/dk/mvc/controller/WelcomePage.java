package com.dk.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author DingKai
 * @Classname WelcomePage
 * @Description TODO
 * @create 2019/2/27
 */
@Controller
public class WelcomePage {
    @ResponseBody
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String Welcome(){
        System.out.println("action hello");
        return "Welcome.";
    }
}
