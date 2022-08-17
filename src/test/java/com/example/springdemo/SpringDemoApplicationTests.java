package com.example.springdemo;

import com.example.springdemo.annotation.demo1.demo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringDemoApplicationTests {
@Autowired
    demo demo;
    @Test
    void contextLoads() {
        demo.getIn(12);
    }

}
