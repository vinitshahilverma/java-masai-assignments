package com.useCase;

import java.util.Scanner;

import com.dao.TrainingDao;
import com.dao.TrainingDaoImpl;
import com.masai.beans.Teacher;

public class setTeacher {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  
		  Teacher tea = new Teacher();
		  
		  System.out.println("Enter Teacher name");
		  tea.setTeacherName(sc.next());
		  
		  System.out.println("Enter Number of year of experince");
		  tea.setNoYearOfExperience(sc.nextInt());
		  
		  System.out.println("Enter email");
		  tea.setEmail(sc.next());
		  
		  TrainingDao dao = new TrainingDaoImpl();
		  
		  dao.registerTeacher(tea);
          

	}

}
