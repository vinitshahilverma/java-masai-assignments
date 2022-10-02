package com.question2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class deleteRecord {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insert Department id");
		
		int id = sc.nextInt();
	  
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		 
		 String url = "jdbc:mysql://localhost:3306/shahil_sb101";
		 
		 
		 try (Connection conn = DriverManager.getConnection(url,"root","root")){
			 
			 PreparedStatement ps = conn.prepareStatement("delete from employee where deptid = ?");
			 
			 ps.setInt(1, id);
			 
			 int x = ps.executeUpdate();
			 
			 if(x>0) {
				 System.out.println("Update succesfully");
			 }
			 else {
				 System.out.println("Record not found");
			 }
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
