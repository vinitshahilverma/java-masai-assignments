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
	
//	@Bean
//	public InMemoryUserDetailsManager userDetails() {
//		
//		InMemoryUserDetailsManager userDetails = new InMemoryUserDetailsManager();
//		
//		UserDetails admin = User.withUsername("ADMIN")
//				                .password("$2a$12$TelF276APPMYvNoKN.C18.ow5kgnS1B77j41WPFfUq83T1...aRhS")
//				                .authorities("admin").build();
//		
//		UserDetails user = User.withUsername("USER")
//				                  .password("$2a$12$EK.wF2sOj32TUDie/9OYFOm51fmx/bnhQhCag3XcGqLr3NcOoM93W")
//				                  .authorities("user").build();
//		
////		admin = 12345
////		student = 54321
//		
//		userDetails.createUser(admin);
//		userDetails.createUser(user);
//		
//		return userDetails;
//	}
	
	@Bean
	public PasswordEncoder encodePassword() {
		
		return new BCryptPasswordEncoder();
	}

    @Bean
	public SecurityFilterChain securityConfig(HttpSecurity http)throws Exception{
		
		http.authorizeHttpRequests(
				
				(auth) -> auth
				.requestMatchers("/addStudents","/deletecourses/{id}","/updatecourses/{id}","/addcourses",
						"/getStudentByCourseId/{cid}","/students","/getStudents/{id}"
						,"/deleteStudents/{id}","/addStudents","/updateStudents/{id}",
						"/getCoursesOfStudent/{id}","/registerStudents/{sid}/course/{cid}").hasAuthority("admin")
				.requestMatchers("/getStudents/{id}","/getCoursesOfStudent/{id}").hasAuthority("user")
				.requestMatchers("/courses").permitAll()
				
				).csrf().disable()
		         .httpBasic();
		
		
		return http.build();
	}
	

}
