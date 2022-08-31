package com.example.springdemo.singleton.demo1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;
@Scope("prototype")
@Component
public class RandClass {
    private  int ran=new Random().nextInt(100);
     public  int getRan(){
         return ran;
     }
}
