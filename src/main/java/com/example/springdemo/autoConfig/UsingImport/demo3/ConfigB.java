package com.example.springdemo.autoConfig.UsingImport.demo3;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//@Configuration
@Import({ZooRegister.class})
public class ConfigB {
}
