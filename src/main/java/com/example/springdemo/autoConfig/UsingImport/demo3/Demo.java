package com.example.springdemo.autoConfig.UsingImport.demo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String[] args) {
ApplicationContext applicationContext=new AnnotationConfigApplicationContext(ConfigB.class);
        Dog dog = applicationContext.getBean("dog", Dog.class);
        System.out.println(dog.getClass().getSimpleName());

    }
}
