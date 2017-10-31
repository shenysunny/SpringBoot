package com.spring.boot.web.tomcat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;
//exclude = ErrorMvcAutoConfiguration.class =>关闭默认的异常处理

@SpringBootApplication(scanBasePackages = "com.spring.boot.web",exclude = ErrorMvcAutoConfiguration.class)
public class SpringbootWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWebApplication.class, args);
	}
}
