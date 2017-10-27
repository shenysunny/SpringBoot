package com.spring.boot.web.handler;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class HandlerInterceptorConfig extends WebMvcConfigurerAdapter{
    public void addInterceptors(InterceptorRegistry registry){
        //registry.addInterceptor(new UserHandlerInterceptor());
    }
}
