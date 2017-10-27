package com.spring.boot.st12;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

public class MyApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        System.out.println("bean count: " + configurableApplicationContext.getBeanDefinitionCount());
        //ConfigurableBeanFactory bf = configurableApplicationContext.getBeanFactory();
    }
}
