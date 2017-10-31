package com.spring.boot.web.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GolbalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public String errorHandler(Exception e) {
        return "GolbalExceptionHandler" + e.getClass().getName();
    }
}
