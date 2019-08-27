package com.dk.init;

import org.springframework.context.annotation.Configuration;

/**
 * @author DingKai
 * @version 1.0
 * @date 2019/8/27
 */
@Configuration
public class TestConfiguration {
    public TestConfiguration() {
        System.out.println("TestConfiguration Initialization");
    }
}
