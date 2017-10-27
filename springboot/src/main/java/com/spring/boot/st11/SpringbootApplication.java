package com.spring.boot.st11;

import com.spring.boot.enable.MyConfiguration;
import com.spring.boot.enable.MyImportSelector;
import com.spring.boot.enable.User;
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
@Import({MyApplicationEvent.class })
public class SpringbootApplication {

    public static void main(String[] args) {
       SpringApplication app = new SpringApplication(SpringbootApplication.class);
       //app.addListeners(new ApplicationListener());
       ConfigurableApplicationContext context = app.run(args);
       context.publishEvent(new MyApplicationEvent(new Object()));
       context.close();
    }
}
