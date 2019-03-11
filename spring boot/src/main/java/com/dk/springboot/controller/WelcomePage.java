package com.dk.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author DingKai
 * @Classname WelcomePage
 * @Description TODO
 * @create 2019/3/11
 */
@Controller
public class WelcomePage {

    @RequestMapping(value = "/hello")
    public ModelAndView welcome(){
        System.out.println("WelcomePage Controller");
        return new ModelAndView("index");
    }
}
