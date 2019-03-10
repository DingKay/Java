package com.dk.test;

import com.dk.mvc.controller.WelcomePage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author DingKai
 * @Classname ToTestWelcomePage
 * @Description TODO
 * @create 2019/3/8
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/contextConfigLocation.xml"})
public class ToTestWelcomePage {
    /*
    模拟request, response
    * */
    private MockHttpServletRequest request;
    private MockHttpServletResponse response;

    /*
    * 注入WelcomePage controller
    * */
    @Autowired
    private WelcomePage welcomePage;

    /*
    * 执行测试方法之前初始化模拟Request, Response
    * */
    @Before
    public void setUp(){
        request = new MockHttpServletRequest();
        request.setCharacterEncoding("UTF-8");
        response = new MockHttpServletResponse();
    }

    @Test
    public void testWelcomePage(){
        Assert.assertEquals("Welcome.", welcomePage.welcome("" ,request));
    }
}
