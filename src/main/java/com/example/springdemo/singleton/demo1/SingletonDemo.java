package com.example.springdemo.singleton.demo1;

import com.example.springdemo.SpringDemoApplication;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
public class SingletonDemo {
    @Autowired
    private RandClass randClass;

    public static void main(String[] args) {
        getBean();//使用beadnFactory获取实例。
        getBeanByAutoWired();//自动注入在项目创建的时候被创建。所以多例模式开了之后也不能获取两个bean
    }

    /**
     * 使用bean工程获取实例
     */
    public static void getBean(){
        ConfigurableApplicationContext run = SpringApplication.run(SpringDemoApplication.class, new String[]{});
        RandClass bean1 = run.getBean("randClass", RandClass.class);
        RandClass bean2 = run.getBean("randClass", RandClass.class);
        System.out.println(bean1.getRan());
        System.out.println(bean2.getRan());
    }
    /**
     * 使用autowired 获取实例
     */
    public static  void getBeanByAutoWired(){
        ConfigurableApplicationContext run = SpringApplication.run(SpringDemoApplication.class, new String[]{});
        SingletonDemo singletonDemo = run.getBean("singletonDemo", SingletonDemo.class);
        System.out.println(singletonDemo.randClass.getRan());
        System.out.println(singletonDemo.randClass.getRan());
    }
}
