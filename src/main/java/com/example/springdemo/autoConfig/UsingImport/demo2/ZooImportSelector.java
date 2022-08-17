package com.example.springdemo.autoConfig.UsingImport.demo2;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class ZooImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.example.springdemo.autoConfig.component.demo2.ZooConfig"};
    }
}
