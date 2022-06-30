package com.mini.dev.config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration 
public class DataSourceConfig {
	
	/* 
	 *  @ConfigurationProperties : application.properties에 있는 값들을 사용할 수 있게한다. 
	 * 
	 * 	: DataSource가 application.properties에 등록된 DB정보들을 사용하겠다는 뜻이다.
	 *
	 *	! 만약 application.properties에 있는 정보를 쓰지 않을 시,
	 *	
	 *	: DataSourceBuilder.create().username().password().url().driverClassName().build(); 파라미터에 값을 넣어 return해준다.
	 */
	
	@ConfigurationProperties(prefix = "spring.datasource")
	@Bean
	public DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}
	
}
