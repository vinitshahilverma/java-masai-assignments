package com.question1_b;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Course id");
		int id = sc.nextInt();
		
		System.out.println("Enter Course name");
		String name = sc.next();
		
		System.out.println("Enter Course fee");
		int fee = sc.nextInt();
		
		System.out.println("Enter Course Duration");
		String duration = sc.next();
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/shahil_sb101";
		
		try (Connection conn = DriverManager.getConnection(url, "root", "root")){
			
		  PreparedStatement ps = conn.prepareStatement("insert into Course values(?,?,?,?)");
		   
		  ps.setInt(1, id);
		  ps.setString(2,name);
		  ps.setInt(3, fee);
		  ps.setString(4, duration);
		  
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
