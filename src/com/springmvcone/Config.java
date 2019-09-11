package com.springmvcone;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = {"com.springmvcone"})
@EnableTransactionManagement
@EnableAspectJAutoProxy
public class Config {
	@Bean("jdbcTemplate")
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(driverMangerDataSource());
	}
	
	@Bean("dataSource")
	public DriverManagerDataSource driverMangerDataSource() {
		 DriverManagerDataSource ds = new DriverManagerDataSource();
		 
		 ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		 ds.setUrl("jdbc:mysql://localhost:3306/psldb");
		 ds.setUsername("root");
		 ds.setPassword("root");
		 
		 return ds;
		 }
	
	@Bean("txManager")
	public DataSourceTransactionManager dataSourceTransactionManager() {
		return new DataSourceTransactionManager(driverMangerDataSource());
	}
}
