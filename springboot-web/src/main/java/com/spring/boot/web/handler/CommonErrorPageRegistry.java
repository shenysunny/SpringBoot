package com.spring.boot.web.handler;

import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.boot.web.servlet.ErrorPageRegistrar;
import org.springframework.boot.web.servlet.ErrorPageRegistry;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

/**
 * 异常处理
 */
@Component
public class CommonErrorPageRegistry implements ErrorPageRegistrar {
    @Override
    public void registerErrorPages(ErrorPageRegistry errorPageRegistry) {
        ErrorPage e404 = new ErrorPage(HttpStatus.NOT_FOUND,"/404.html");
        System.out.println("404");
        ErrorPage e500 = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR,"/500.html");
        System.out.println("500");
        errorPageRegistry.addErrorPages(e404,e500);
    }
}
