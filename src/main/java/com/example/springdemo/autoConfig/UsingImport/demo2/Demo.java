package com.example.springdemo.autoConfig.UsingImport.demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String[] args) {
    ApplicationContext applicationContext=new AnnotationConfigApplicationContext(ConfigB.class);
    ZooConfig zc=applicationContext.getBean(ZooConfig.class);
    Tiger t = applicationContext.getBean(Tiger.class);
        System.out.println(zc.getClass().getSimpleName());
        System.out.println(t.getClass().getSimpleName());
    }

}
