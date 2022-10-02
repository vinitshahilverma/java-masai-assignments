package com.question1_a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student roll");
		int roll = sc.nextInt();
		
		System.out.println("Enter Student name");
		String name = sc.next();
		
		System.out.println("Enter Student address");
		String add = sc.next();
		
		System.out.println("Enter Student mobile number only 10 digit");
		String mobile = sc.next();
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/shahil_sb101";
		
		try (Connection conn = DriverManager.getConnection(url, "root", "root")){
			
		  PreparedStatement ps = conn.prepareStatement("insert into Student values(?,?,?,?)");
		   
		  ps.setInt(1, roll);
		  ps.setString(2,name);
		  ps.setString(3, add);
		  ps.setString(4, mobile);
		  
		  int x = ps.executeUpdate();
		  
		  if(x>0) {
			  System.out.println("Record updated...");
		  }
		  else {
			  System.out.println("Record not updated...");
		  }
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
