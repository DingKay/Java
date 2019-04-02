package com.dk.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.dk.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserAction {

    /**
     * @Description
     * Remotely injection ,this annotation equals @AutoWired
     * */
    @Reference
    private UserService userService;

    @RequestMapping("/get")
    public String getName(){
        String name = userService.getName();
        return name;
    }
}
