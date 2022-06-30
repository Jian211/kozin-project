package com.mini.dev.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

/* 
 * 	@MapperScan : DAO interface를 등록한다.  == @MapperScan(basePackages = {"com.project.mong.dao"}) 
 * 	
 * 	SqlSessionFactory : MySQL과 mybatis를 연결해주는 객체
 * 
 *  SqlSessionFactoryBean : SqlSessionFactory를 생성해주는 클래스
 * 
 */

@Configuration
@MapperScan("com.mini.dev.product.dao")
public class MySQLConfig {
	
	@Bean
	public SqlSessionFactory sqlSessionFatory(DataSource dataSource) throws Exception {
		final SqlSessionFactoryBean sessionFatory = new SqlSessionFactoryBean();
		sessionFatory.setDataSource(dataSource);
		
		// resolver로 xml파일을 찾아 sessionFatory에 Mapper를 셋팅한다.
		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		sessionFatory.setMapperLocations(resolver.getResources("classpath:mybatis/mapper/*Mapper.xml"));
		
		// mybatis-config 파일 sessionFatory에 셋팅
		Resource mybatisConfig = new PathMatchingResourcePatternResolver().getResource("classpath:mybatis/mybatis-config.xml");
		sessionFatory.setConfigLocation(mybatisConfig);
		
		return sessionFatory.getObject();
	}
	
	
}
