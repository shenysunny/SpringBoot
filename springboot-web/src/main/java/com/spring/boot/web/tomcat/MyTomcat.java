package com.spring.boot.web.tomcat;

import org.apache.catalina.connector.Connector;
import org.apache.catalina.valves.AccessLogValve;
import org.apache.coyote.http11.Http11AprProtocol;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.stereotype.Component;

import java.io.File;

//@Component
public class MyTomcat implements EmbeddedServletContainerCustomizer{
    @Override
    public void customize(ConfigurableEmbeddedServletContainer configurableEmbeddedServletContainer) {
        TomcatEmbeddedServletContainerFactory factory = (TomcatEmbeddedServletContainerFactory)configurableEmbeddedServletContainer;
        //端口
        factory.setPort(1080);
        //临时文件位置
        factory.setBaseDirectory(new File("C:\\Users\\Administrator\\Desktop\\log"));
        //启用日志
       // factory.addContextValves(getAccessLogValve());

        //Tomcat 连接配置
      factory.addConnectorCustomizers(new MyTomcatConnectorCustomizer());

    }
    //Tomcat 连接配置
  class  MyTomcatConnectorCustomizer implements TomcatConnectorCustomizer{

      @Override
      public void customize(Connector connector) {
          Http11AprProtocol protocol = (Http11AprProtocol)connector.getProtocolHandler();
          //最大连接数
          protocol.setMaxConnections(2000);
         // 最大线程数
          protocol.setMaxThreads(500);
      }
  }


    //日志设置
    private AccessLogValve getAccessLogValve(){
        AccessLogValve log = new  AccessLogValve();
//        //启用日志
//        log.setEnabled(false);
//        //日志输出位置
//        log.setDirectory("C:\\Users\\Administrator\\Desktop\\log");
//        //文件名称
//        log.setPrefix("spr");
//        //扩展名
//        log.setSuffix(".zzz");
        return log;
    }
}
