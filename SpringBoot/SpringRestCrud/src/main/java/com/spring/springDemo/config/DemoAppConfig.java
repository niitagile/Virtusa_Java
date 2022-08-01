package com.spring.springDemo.config;

import java.beans.PropertyVetoException;
import java.util.Properties;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@Configuration
//@EnableWebMvc - for spring mvc
@EnableWebMvc
@EnableTransactionManagement
@ComponentScan("com.spring.springDemo")
@PropertySource({"classpath:persistence-oracle.properties"})
public class DemoAppConfig implements WebMvcConfigurer {
	
	private Environment env;
	private Logger logger=Logger.getLogger(getClass().getName());
	@Bean
	public DataSource myDataSource() {
		//to bound datasource with environment use combopooleddatasource
		ComboPooledDataSource myDataSource=new ComboPooledDataSource();
		try {
				myDataSource.setDriverClass("");
		}
		catch(PropertyVetoException exc) {
			exc.printStackTrace();
		}
		logger.info("jdbc.url="+env.getProperty("jdbc.url"));
		logger.info("jdbc.user="+env.getProperty("jdbc.user"));
		myDataSource.setJdbcUrl(env.getProperty("jdbc.url"));
		myDataSource.setUser(env.getProperty("jdbc.user"));
		myDataSource.setPassword(env.getProperty("jdbc.password"));
		myDataSource.setInitialPoolSize(getIntProperty("connection.pool.initialPoolSize"));
		myDataSource.setMinPoolSize(getIntProperty("connection.pool.minPoolSize"));
		myDataSource.setMaxPoolSize(getIntProperty("connection.pool.maxPoolSize"));
		myDataSource.setMaxIdleTime(getIntProperty("connection.pool.maxIdleTime"));
		return myDataSource;
	}
	
	private Properties getHibernateProperties() {
		Properties props=new Properties();
		props.setProperty("hibernate.dialect",env.getProperty("hibernate.dialect") );
		props.setProperty("hibernate.show_sql",env.getProperty("hibernate.show_sql") );
		return props;
	}
	private int getIntProperty(String propName) {
		String propVal=env.getProperty(propName);
		int intPropVal=Integer.parseInt(propVal);
		return intPropVal;
	}
}
