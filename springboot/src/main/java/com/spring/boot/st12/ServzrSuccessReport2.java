package com.spring.boot.st12;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Order(2)
@Component
public class ServzrSuccessReport2 implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        System.out.println("B: ================ServzrSuccessReport================"+ Arrays.asList(strings));
    }
}
