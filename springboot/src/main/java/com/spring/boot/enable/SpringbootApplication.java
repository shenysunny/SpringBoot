package com.spring.boot.enable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * 项目启动
 */
@SpringBootApplication
@EnableAsync
//@Import(MyImportSelector.class)
@Import({User.class ,MyConfiguration.class , MyImportSelector.class})
public class SpringbootApplication {

    public static void main(String[] args) {
        //启动Springoot
        ConfigurableApplicationContext context = SpringApplication.run(SpringbootApplication.class, args);
//        context.getBean(Runnable.class).run();
//        System.out.println("------------------end----------------------");
       System.out.println(context.getBean(User.class));
        System.out.println(context.getBean(User.class));

//
        //关闭
        context.close();
    }
}
