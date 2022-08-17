package com.example.springdemo.autoConfig.UsingImport.demo2;

import org.springframework.context.annotation.Bean;

public class ZooConfig {
    @Bean
    public  Tiger tiger(){
        return  new Tiger();
    }
}
