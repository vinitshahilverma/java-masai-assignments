package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Repository;

import com.beans.Student;
import com.config.AppConfig;
import com.config.DBUtil;

@Repository
public class StudentDaoImpl implements StudentDao {

	public String saveStudent(Student student) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		DBUtil db = ctx.getBean("db", DBUtil.class);

		String result = "Failed to add Student";

		Connection conn = db.provideConnection();

		try {
			PreparedStatement ps = conn.prepareStatement("insert into Student values(?,?,?)");

			ps.setInt(1, student.getRoll());
			ps.setString(2, student.getName());
			ps.setInt(3, student.getMarks());

			int x = ps.executeUpdate();

			if (x > 0) {
				result = "Student details added succesfully";
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			result += e.getMessage();
		}

		return result;
	}
}
