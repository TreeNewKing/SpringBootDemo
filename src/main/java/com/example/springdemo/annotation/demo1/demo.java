package com.example.springdemo.annotation.demo1;

import com.example.springdemo.SpringDemoApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Component
public class demo {
    @MyAnnotaion(country = "CN",age = 18)//age参数是限制年龄。年龄超过它才能访问
  public void getIn(int age){
      System.out.println("准备进入某网站");
      print(age);
      System.out.println("欢迎下次访问");
   }

//fixme 这个地方的aop直接不能被捕获。只有上面这个方法的会被捕获(上面那个方法调用的这个方法。如果上面那个方法不加注解就不能进入aop)
    @MyAnnotaion(country = "CN",age = 18)
    public  void print(int age){
        System.out.println("i get in");
    }
}
