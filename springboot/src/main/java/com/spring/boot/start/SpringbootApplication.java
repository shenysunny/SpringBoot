package com.spring.boot.start;

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
		//数据配置
		context.getBean(MyData.class).show();
		//多个配置文件
		context.getBean(MyConfig.class).show();
       //关闭
		context.close();
	}
}
