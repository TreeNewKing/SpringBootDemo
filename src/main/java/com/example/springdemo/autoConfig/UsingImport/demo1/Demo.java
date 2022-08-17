package com.example.springdemo.autoConfig.UsingImport.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String[] args) {
//       通过B配置类获取容器
        ApplicationContext context=new AnnotationConfigApplicationContext(ConfigB.class);
//       通过容器获得A配置类的Bean和A的Bean
        ConfigA ca = context.getBean(ConfigA.class);
        A a = context.getBean(A.class);
//        输出结果
        System.out.println(ca.getClass().getSimpleName());
        System.out.println(a.getClass().getSimpleName());

    }
}