package com.question1_h;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter Student roll");
		 
		 int roll = sc.nextInt();
		 
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			String url = "jdbc:mysql://localhost:3306/shahil_sb101";
			
			try (Connection conn = DriverManager.getConnection(url, "root", "root")){
				
				  PreparedStatement ps = conn.prepareStatement("select s.roll,s.name,c.cid,c.cname,c.fee,c.duration from student s Inner Join course c Inner join Student_Course sc On s.roll = sc.roll AND c.cid = sc.cid where s.roll=?;");
				   
				  ps.setInt(1, roll);
				  
				  ResultSet rs = ps.executeQuery();
				  
				  boolean flag = false;
				  
				  while(rs.next()) {
					  
					  flag = true;
					  
					  int rol = rs.getInt("roll");
					  String name = rs.getString("name");
					  int cid = rs.getInt("cid");
					  String cname = rs.getString("cname");
					  int fee = rs.getInt("fee");
					  String duration = rs.getString("duration");
					  
					  System.out.println("roll = " +rol);
					  System.out.println("name = " +name);
					  System.out.println("course id = " +cid);
					  System.out.println("Course name = " +cid);
					  System.out.println("fee = " +fee);
					  System.out.println("duration  = " +duration);
					  
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
