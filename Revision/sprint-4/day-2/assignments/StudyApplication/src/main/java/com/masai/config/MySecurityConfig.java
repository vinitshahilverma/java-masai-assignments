package com.masai.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class MySecurityConfig {
	
	@Bean
	public InMemoryUserDetailsManager userDetails() {
		
		InMemoryUserDetailsManager userDetails = new InMemoryUserDetailsManager();
		
		UserDetails admin = User.withUsername("admin")
				                .password("$2a$12$nG4SnNHpVsLgFaydyMt69eoKSxA57TBgl8CWfOInBQsjNoC.IVPxO")
				                .authorities("admin").build();
		
		UserDetails student = User.withUsername("student")
				                  .password("$2a$12$1DCnVxmcqTXFquRupqsKG.4OEFu73dDijAR//15RbpUbnDwGkDf2q")
				                  .authorities("student").build();
		
//		admin = 12345
//		student = 54321
		
		userDetails.createUser(admin);
		userDetails.createUser(student);
		
		return userDetails;
	}
	
	@Bean
	public PasswordEncoder encodePassword() {
		
		return new BCryptPasswordEncoder();
	}

    
	public SecurityFilterChain securityConfig(HttpSecurity http)throws Exception{
		
		http.authorizeHttpRequests(
				
				(auth) -> auth.requestMatchers("/students","/students/{id}",
						"/getCoursesOfStudent/{id}","/students/{sid}/course/{cid}"
						,"/courses/{id}","/getStudentByCourseId/{cid}").hasAnyAuthority("admin")
				
				.requestMatchers("/students/{id}","/getCoursesOfStudent/{id}").hasAuthority("student")
				.requestMatchers("/courses").permitAll()
				
				).httpBasic();
		
		
		return http.build();
	}
	

}
