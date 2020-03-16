//package ch.synergysoft.siebel.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configuration
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//	   @Override
//	    protected void configure(HttpSecurity http) throws Exception
//	    {
//	        http
//	         .csrf().disable()
//	         .authorizeRequests().anyRequest().authenticated()
//	         .and()
//	         .httpBasic();
//	    }
//
//	    @Override
//	    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//
//	        auth.inMemoryAuthentication()
//	                .withUser("user").password("{noop}user").roles("user")
//	                .and()
//	                .withUser("admin").password("{noop}admin").roles("admin");
//	    }
//}
