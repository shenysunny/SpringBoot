package com.spring.boot.bean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 项目启动
 */
@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		//启动Springoot
		ConfigurableApplicationContext context = SpringApplication.run(SpringbootApplication.class, args);
		System.out.println(context.getBeansOfType(IncodingConvert.class));
		System.out.println(context.getBeansOfType(Runnable.class));
		//关闭
		context.close();
	}
}
