package com.moses.framework.jdbcOrm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "com.moses.spring.jdbc.framework")
@Import(JdbcConfig.class)
public class JdbcFrameworkConfig {

}
