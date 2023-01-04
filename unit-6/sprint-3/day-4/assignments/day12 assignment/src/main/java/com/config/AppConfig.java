package com.config;

import java.sql.Connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.control.StudentService;

@Configuration
@ComponentScan(basePackages = "com")
@PropertySource("db.properties")
public class AppConfig {

	
}
