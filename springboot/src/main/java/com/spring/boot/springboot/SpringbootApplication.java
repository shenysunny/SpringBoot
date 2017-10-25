package com.spring.boot.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		//启动Springoot
		ConfigurableApplicationContext context = SpringApplication.run(SpringbootApplication.class, args);

	}
}
