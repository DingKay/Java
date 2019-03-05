package com.dk.mvc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;

/**
 * @author DingKai
 * @Classname WelcomePage
 * @Description Welcome Controller
 * @create 2019/2/27
 */
@Controller
public class WelcomePage {
    static Logger logger = LoggerFactory.getLogger(WelcomePage.class);

    @ResponseBody
    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String Welcome(@RequestParam("name") String name , HttpServletRequest request){
        /*解决中文乱码:
        try {
            //设置强制转码
            String s = new String(name.getBytes("UTF-8"), "UTF-8");
            logger.info(s);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }*/
        logger.info("'hello' controller");
        return "Welcome.";
    }
}
