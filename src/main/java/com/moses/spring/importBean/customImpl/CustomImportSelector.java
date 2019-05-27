package com.moses.spring.importBean.customImpl;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class CustomImportSelector implements ImportSelector{

	public String[] selectImports(AnnotationMetadata arg0) {
		return new String[] {"com.moses.spring.importBean.bean.Fish", "com.moses.spring.importBean.bean.Tiger"};
	}

}
