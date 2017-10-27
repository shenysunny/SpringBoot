package com.spring.boot.bean;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

@SpringBootConfiguration
public class IncodingConvertConfig {

    @Bean
    @Conditional(UTFCondition.class)
    public IncodingConvert createUTF8IncodingConvert(){
        return new UTf8IncodingConvert();
    }

    @Bean
    @Conditional(GBKCondition.class)
    public IncodingConvert createGBKIncodingConvert(){
        return new GBKIncodingConvert();
    }
}
