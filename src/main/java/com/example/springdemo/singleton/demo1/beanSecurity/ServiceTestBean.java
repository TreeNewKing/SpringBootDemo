package com.example.springdemo.singleton.demo1.beanSecurity;

import org.springframework.stereotype.Service;

@Service
public class ServiceTestBean {
    int count;
    public int getCount(){
        return count++;
    }
}
