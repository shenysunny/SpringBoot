package com.spring.boot.web.tomcat;

import org.apache.catalina.valves.AccessLogValve;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;

@SpringBootConfiguration
public class WebServerConfiguration {

    @Bean
    public EmbeddedServletContainerFactory ereateEmbeddedServletContainerFactory(){
        TomcatEmbeddedServletContainerFactory factory = new TomcatEmbeddedServletContainerFactory();
         //端口
        factory.setPort(8080 );
        //异常处理
        factory.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND , "/404.html"));
        //启用日志
        factory.addInitializers((servletContext -> {
            System.out.println("================servletContext=================");
        }));
        factory.addAdditionalTomcatConnectors();
        factory.addContextValves(getAccessLogValve());

        return  factory;
    }
    //日志设置
    private AccessLogValve getAccessLogValve() {
        AccessLogValve log = new AccessLogValve();
        //启用日志
        log.setEnabled(true);
        //日志输出位置
        log.setDirectory("C:\\Users\\Administrator\\Desktop\\log\\logs");
        //文件名称
        log.setPrefix("spring-boot-log");
        //扩展名
        log.setSuffix(".txt");
        return log;
    }
}
