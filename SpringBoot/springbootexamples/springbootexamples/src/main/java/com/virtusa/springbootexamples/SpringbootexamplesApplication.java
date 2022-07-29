package com.virtusa.springbootexamples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*@SpringBootApplication adds 3 more annotation
 * @Configuration - it tags the class as a source of bean definitions for application context
 * @EnableAutoConfiguration: it tells spring boot to start adding beans based on classpath settings, other beans and other property settings
 * @ComponentScan : it tells spring to look for other componets, configurations and services 
 */
@SpringBootApplication
public class SpringbootexamplesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootexamplesApplication.class, args);
	}

}
