package com.spring.boot.st12;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 项目启动
 */
@SpringBootApplication(scanBasePackages = "com.spring.boot")
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SpringbootApplication.class);
        ConfigurableApplicationContext context = app.run("aa","bb","cc");
        context.close();
    }
}
