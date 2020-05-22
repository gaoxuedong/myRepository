package com.gaoxd.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import com.gaoxd.dao.OrdupwMapper;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@MapperScan(basePackageClasses=OrdupwMapper.class)
public class CommConfig {
	
	@Bean
	@ConfigurationProperties("datasource")
	public HikariConfig config(){
		return new HikariConfig();
	}
	@Bean
	public DataSource getDataSource(HikariConfig config) {
		return new HikariDataSource(config);
	}
	
	@Bean
	public SqlSessionFactory getSqlSessionFactory(DataSource dataSource) throws Exception{
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(dataSource);
/*		factoryBean.setTypeAliasesPackage("com.gaoxd.dao");*/
		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		factoryBean.setMapperLocations(resolver.getResources("classpath:com/gaoxd/mapper/*Mapper.xml"));
		return factoryBean.getObject();
	}

}
