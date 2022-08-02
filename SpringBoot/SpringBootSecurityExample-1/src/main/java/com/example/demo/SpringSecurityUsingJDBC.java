/*
 * package com.example.demo;
 * 
 * import javax.sql.DataSource;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.autoconfigure.EnableAutoConfiguration; import
 * org.springframework.context.annotation.Bean; import
 * org.springframework.security.config.annotation.authentication.builders.
 * AuthenticationManagerBuilder; import
 * org.springframework.security.config.annotation.web.builders.WebSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * WebSecurityConfigurerAdapter; import
 * org.springframework.security.core.userdetails.User; import
 * org.springframework.security.crypto.factory.PasswordEncoderFactories; import
 * org.springframework.security.crypto.password.NoOpPasswordEncoder; import
 * org.springframework.security.crypto.password.PasswordEncoder;
 * 
 * @EnableAutoConfiguration public class SpringSecurityUsingJDBC extends
 * WebSecurityConfigurerAdapter {
 * 
 * @Autowired DataSource dataSource;
 * 
 * @Override protected void configure(AuthenticationManagerBuilder auth) throws
 * Exception { System.out.println("Hello");
 * 
 * auth.jdbcAuthentication().dataSource(dataSource).withDefaultSchema()
 * .withUser(User.withUsername("Mahesh").password("Mahesh@123").roles(
 * "SALESPERSON"))
 * .withUser(User.withUsername("Kanika").password("Kanika@123").roles("Clerk"));
 * }
 * 
 * @Bean PasswordEncoder getPasswordEncoder() { return
 * NoOpPasswordEncoder.getInstance(); }
 * 
 * @Override public void configure(WebSecurity web) throws Exception {
 * web.ignoring().antMatchers("/h2-console/**"); }
 * 
 * 
 * }
 */