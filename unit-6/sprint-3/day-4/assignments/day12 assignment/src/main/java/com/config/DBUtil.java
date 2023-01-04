package com.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Repository;

@Repository(value = "db")
public class DBUtil {

	@Autowired
	private Environment env;

	public Connection provideConnection() {

		Connection conn = null;

		try {
			Class.forName(env.getProperty("db.driverName"));

			String url = env.getProperty("db.url");

			conn = DriverManager.getConnection(url, env.getProperty("db.username"), env.getProperty("db.password"));

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (

		SQLException e) {

			e.printStackTrace();
		}

		return conn;
	}

}
