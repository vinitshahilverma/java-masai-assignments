package com.question2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Account {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Department name");
		
		String dept = sc.next();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/shahil_sb101";
		
		try(Connection conn = DriverManager.getConnection(url, "root", "root")) {
			
			PreparedStatement ps = conn.prepareStatement("Select * from employee where deptid = (select did from department where dname = ?)");
			
			ps.setString(1, dept);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int id = rs.getInt("empId");
				String name = rs.getString("ename");
				String add = rs.getString("address");
				String mob= rs.getString("mobile");
				int did = rs.getInt("deptid");
				
				
				System.out.println("Employee id is : " +id);
				System.out.println("Employee name is : " +name);
				System.out.println("Employee address is : " +add);
				System.out.println("Employee mobile no is : " +mob);
				System.out.println("Employee department id is : " +did);
				
				
				System.out.println("=========================================");
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
