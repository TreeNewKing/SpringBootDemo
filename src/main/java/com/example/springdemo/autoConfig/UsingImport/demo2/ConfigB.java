package com.example.springdemo.autoConfig.UsingImport.demo2;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//@Configuration
@Import({ZooImportSelector.class})
public class ConfigB {
}
