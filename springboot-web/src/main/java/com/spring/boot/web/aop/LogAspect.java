package com.spring.boot.web.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LogAspect {

     //前置通知
    @Before("execution(* com.spring.boot.web.aop..*.*(..))")
    public void  logBefore(){
        System.out.println("===================logBefore======");
    }

    //后置通知
    @After("execution(* com.spring.boot.web.aop..*.*(..))")
    public void  logAfter(JoinPoint point){
        //获取方法名
        System.out.println("-----------------" + point.getSignature().getName() );
        //参数获取
        System.out.println(point.getTarget().getClass()+ "==============" + Arrays.asList(point.getArgs()));
        System.out.println("===================logAfter======");
    }
}
