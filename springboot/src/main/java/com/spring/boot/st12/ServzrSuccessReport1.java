package com.spring.boot.st12;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Order(1)
@Component
public class ServzrSuccessReport1 implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        System.out.println("A: ================ServzrSuccessReport================" + Arrays.asList(strings));
    }
}
