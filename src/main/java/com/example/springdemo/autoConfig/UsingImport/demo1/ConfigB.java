package com.example.springdemo.autoConfig.UsingImport.demo1;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//@Configuration
@Import(ConfigA.class)
public class ConfigB {

}