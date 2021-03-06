package com.rgs.springcloudclientb.config;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

public class MyTypeFilter implements TypeFilter {

    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {

        // 获取当前类的注解的信息
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();

        // 获取当前类的类信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();

        // 获取当前类资源(类路径)
        Resource resource = metadataReader.getResource();

        // 获取当前类的类名
        String className = classMetadata.getClassName();
        if(className.contains("Service")){
            return true;
        }
        return false;
    }
}
