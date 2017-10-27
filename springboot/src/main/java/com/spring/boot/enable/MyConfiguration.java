package com.spring.boot.enable;

import org.springframework.context.annotation.Bean;

public class MyConfiguration {

    @Bean
    public Runnable createRunnable1(){
        return () ->{};
    }

    @Bean
    public Runnable createRunnable2(){
        return () ->{};
    }
}
