package com.example.springdemo.singleton.demo1.beanSecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Scope("prototype")//变为多例后线程安全
public class TestController {
@Autowired
   private ServiceTestBean serviceTestBean;

private  int count;//单例模式下不安全
    @GetMapping("/beanFactory1")
    public int beanFactory1(){
        return  serviceTestBean.getCount();
}
@GetMapping("/beanFactory2")
    public int beanFactory2(){
        return  count++;
}
}
