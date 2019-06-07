package com.moses.spring.jdbc.framework.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;

import com.alibaba.druid.pool.DruidDataSource;

@PropertySource("classpath:db.properties")
public class JdbcConfig {
	@Value("${jdbc.driverClass}")
    private String driver;
 
    @Value("${jdbc.url}")
    private String url;
 
    @Value("${jdbc.username}")
    private String user;
 
    @Value("${jdbc.password}")
    private String password;

	
	@Bean(name="dataSource")
    public DataSource createDataSource(){
		DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(password);
        return dataSource;
    }
 
 
	@Bean(name = "jdbcTemplate")
    public JdbcTemplate createJdbcTemplate(DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }
}
