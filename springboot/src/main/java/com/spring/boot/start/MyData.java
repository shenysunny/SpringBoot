package com.spring.boot.start;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@ConfigurationProperties(prefix = "ds")
public class MyData {

    @Autowired
    private Environment evn;

    @Value("${jdbc.jdbcUrl}")
    private String jdbcUrl;

    @Value("${jdbc.jdbcUrls}")
    private String jdbcUrls;

    private List<String> list = new ArrayList<>();

    public void show(){
        System.out.println("============================MyData==============================");
        System.out.println("jdbc.jdbcUrl: "+ evn.getProperty("jdbc.jdbcUrl"));
        System.out.println("jdbcUrl: "+ jdbcUrl);
        System.out.println("jdbcUrls: "+ jdbcUrls);
        System.out.println(list.size());
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "MyData{" +
                "evn=" + evn +
                ", jdbcUrl='" + jdbcUrl + '\'' +
                ", jdbcUrls='" + jdbcUrls + '\'' +
                ", list=" + list +
                '}';
    }
}
