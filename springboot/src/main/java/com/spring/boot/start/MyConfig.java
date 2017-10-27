package com.spring.boot.start;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:dbconfig.yml")
@ConfigurationProperties(prefix = "jdbc")
public class MyConfig {

    private String jdbcUrl;
    private String driverClass;
    private String user;
    private String password;

    public void show(){
        System.out.println("=============================MyConfig=============================");
        System.out.println("jdbcUrl: "+ jdbcUrl);
        System.out.println("driverClass: "+ driverClass);
        System.out.println("user: "+ user);
        System.out.println("password: "+ password);
    }

    public String getJdbcUrl() {
        return jdbcUrl;
    }

    public void setJdbcUrl(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
    }

    public String getDriverClass() {
        return driverClass;
    }

    public void setDriverClass(String driverClass) {
        this.driverClass = driverClass;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
