package com.spring.boot.st11;

/**
 * 监听器
 */
public class ApplicationListener implements org.springframework.context.ApplicationListener<MyApplicationEvent>{

    @Override
    public void onApplicationEvent(MyApplicationEvent myApplicationEvent) {
        System.out.println("============ onApplicationEvent");
    }
}
