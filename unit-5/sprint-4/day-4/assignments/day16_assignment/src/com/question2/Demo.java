package com.question2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.xdevapi.PreparableStatement;

public class Demo {

	public static void main(String[] args) {
		
		   Scanner sc = new Scanner(System.in);
		   
		   System.out.println("Enter employee id");
		   int empId = sc.nextInt();
		   
		   System.out.println("Enter employee name");
		   String ename = sc.next();
		   
		   System.out.println("Enter employee address");
		   String address = sc.next();
		   
		   System.out.println("Enter employee mobile");
		   String mobile = sc.next();
		   
		   System.out.println("Enter employee department id");
		   int deptid = sc.nextInt();
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			String url = "jdbc:mysql://localhost:3306/shahil_sb101";
			
			try (Connection conn = DriverManager.getConnection(url, "root", "root")){
				
				PreparedStatement ps = conn.prepareStatement("insert into employee values (?,?,?,?,?)");
				
				ps.setInt(1, empId);
				ps.setString(2,ename);
				ps.setString(3,address);
				ps.setString(4,mobile);
				ps.setInt(5, deptid);
				
				int x = ps.executeUpdate();
				
				if(x>0) {
					System.out.println("Record inserted");
				}
				else {
					System.out.println("Not inserted");
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
	
		   

	}

}
