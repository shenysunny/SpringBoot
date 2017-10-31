package com.spring.boot.web.actuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = "com.spring.boot.web.actuator")
public class SpringbootWebApplication {

	public static void main(String[] args) {
		//启动Springoot
		ConfigurableApplicationContext context = SpringApplication.run(SpringbootWebApplication.class, args);
		//关闭
		context.close();
	}
}
