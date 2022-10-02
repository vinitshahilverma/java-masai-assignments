package com.question2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Department {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Department id");
		int did = sc.nextInt();
		
		System.out.println("Enter Department name");
		String name = sc.next();
		
		System.out.println("Enter Department location");
		String loc = sc.next();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	     String url = "jdbc:mysql://localhost:3306/shahil_sb101";	
	
		 try(Connection conn = DriverManager.getConnection(url, "root","root")){
			 
			 PreparedStatement ps = conn.prepareStatement("insert into department values (?,?,?)");
			 
			 ps.setInt(1, did);
			 ps.setString(2, name);
			 ps.setString(3, loc);
			 
			 
			 int x = ps.executeUpdate();
			 
			 if(x>0) {
				 System.out.println("Inserted data sucessfully");
			 }
			 else {
				 System.out.println("Not Inserted");
			 }
			 
		   
		 } catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
