package com.example.springdemo.annotation.demo1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.CodeSignature;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

@Aspect
@Component
public class Webadvice {

    @Pointcut("@annotation(com.example.springdemo.annotation.demo1.MyAnnotaion)")
    public void annotationPointcut() {
    }

@Around(value = "annotationPointcut()&&@annotation(myAnnotaion)",argNames = "joinPoint,myAnnotaion")
    public void t(ProceedingJoinPoint joinPoint, MyAnnotaion myAnnotaion) throws Throwable {
    System.out.println("进入aop");
//    fixme 在调用getArgs之前args为空。调用之后底层似乎调用了一个native方法。他的原理是什么？
    Object[] args = joinPoint.getArgs();
    int relAge= (int) joinPoint.getArgs()[0];
    int ageLimit = myAnnotaion.age();
    System.out.println("当前年龄限制"+ageLimit);
    System.out.println("你的年龄"+relAge);
    if (ageLimit>relAge){
        System.out.println("你的年龄不能访问服务");
//        web 服务的时候应该抛出异常然后由springmvc的异常处理器进行处理。但是这里没有controller层所以直接控制台输出后return
        return;
    }
    joinPoint.proceed();
    }

}
