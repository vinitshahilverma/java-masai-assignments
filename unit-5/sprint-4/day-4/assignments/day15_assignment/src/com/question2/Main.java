package com.question2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/sb101db";
		
		try {
			
			Connection conn = DriverManager.getConnection(url,"root", "root");

			if(conn!=null) {
				System.out.println("Connected..");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
