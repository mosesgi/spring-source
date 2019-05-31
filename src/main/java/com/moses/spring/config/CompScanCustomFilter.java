package com.moses.spring.config;

import java.io.IOException;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

public class CompScanCustomFilter implements TypeFilter {
	private ClassMetadata metadata;

	/*
	 * MetadataReader:读取到当前正在扫描类的信息
	 * MetadataReaderFactory:可以获取到其他任何类信息
	 */
	public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
		//获取当前类注解的信息
		AnnotationMetadata aM = metadataReader.getAnnotationMetadata();
		//获取当前正在扫描的类信息
		metadata = metadataReader.getClassMetadata();
		//获取当前类资源(类的路径)
		Resource resource = metadataReader.getResource();
		
		String className = metadata.getClassName();
		System.out.println("----->"+className);
		if(className.contains("dao")) {
			return true;
		}
		return false;
	}

}
