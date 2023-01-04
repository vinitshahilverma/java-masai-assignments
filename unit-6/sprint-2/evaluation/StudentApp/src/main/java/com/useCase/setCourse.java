package com.useCase;

import java.util.Scanner;

import com.dao.TrainingDao;
import com.dao.TrainingDaoImpl;
import com.masai.beans.Course;

public class setCourse {

	public static void main(String[] args) {

               Scanner sc = new Scanner(System.in);
               
               Course curr = new Course();
               
               System.out.println("Enter course Name");
               curr.setCoursename(sc.next());
               
               System.out.println("Enter course duration");
               curr.setDuration(sc.next());
               
               System.out.println("Enter course fee");
               curr.setFee(sc.nextInt());
               
               TrainingDao dao = new TrainingDaoImpl();
               
                 dao.addCourse(curr);

	}

}
