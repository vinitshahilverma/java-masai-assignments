package com.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Database {
	
	@Value("${db.driverName}")
	private String driverName;
	
	@Value("${db.url}")
	private String url;

	@Value("${db.username}")
	private String username;
	

	@Value("${db.password}")
	private String password;

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Database() {
		super();
	}

	public Database(String driverName, String url, String username, String password) {
		super();
		this.driverName = driverName;
		this.url = url;
		this.username = username;
		this.password = password;
	}

	public String getDriverName() {
		return driverName;
	}

	public String getUrl() {
		return url;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

}
