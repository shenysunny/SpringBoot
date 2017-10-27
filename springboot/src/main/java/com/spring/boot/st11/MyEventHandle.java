package com.spring.boot.st11;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventHandle {
    @EventListener
    public void event(MyApplicationEvent myApplicationEvent) {
        System.out.println("MyEventHandle============ onApplicationEvent");
    }
}
