package com.question1_i;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter Course Name");
		 
	     String cname = sc.next();
		 
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			String url = "jdbc:mysql://localhost:3306/shahil_sb101";
			
			try (Connection conn = DriverManager.getConnection(url, "root", "root")){
				
				  PreparedStatement ps = conn.prepareStatement("select s.roll,s.name,s.mobile,s.address,c.cname from student s Inner Join course c Inner join Student_Course sc On s.roll = sc.roll AND c.cid = sc.cid where c.cname=?;");
				   
				  ps.setString(1, cname);
				  
				  ResultSet rs = ps.executeQuery();
				  
				  boolean flag = false;
				  
				  while(rs.next()) {
					  
					  flag = true;
					  
					  int rol = rs.getInt("roll");
					  String name = rs.getString("name");
					  String mobile = rs.getString("mobile");
					  String address = rs.getString("address");
					  String cnamee = rs.getString("cname");
					  
					  System.out.println("roll = " +rol);
					  System.out.println("name = " +name);
					  System.out.println("mobile number = " + mobile);
					  System.out.println("Course name = " +address);
					  System.out.println("Course name = " +cname);
					  
					  
					  System.out.println("=======================================================");
					  
				  }
				  if(flag==false) {
					  System.out.println("No Record found");
				  }
					
				} catch (SQLException e) {
					e.printStackTrace();
				}

	}

}
