package com.masai.bean;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializeTest {

	public static void main(String[] args) throws IOException {

		FileOutputStream out = new FileOutputStream("myStudent.txt");

		ObjectOutputStream oos = new ObjectOutputStream(out);

		FileOutputStream out1 = new FileOutputStream("myEmployee.txt");

		ObjectOutputStream oos1 = new ObjectOutputStream(out1);

		List<Student> listStudent = new ArrayList<>();

		listStudent.add(new Student(10, "Shahil", 24, 100, 700));
		listStudent.add(new Student(11, "Verma", 24, 110, 800));
		listStudent.add(new Student(12, "Vinit", 24, 120, 900));

		List<Employee> listEmpolyee = new ArrayList<>();

		listEmpolyee.add(new Employee(13, "Yash", 26, 20000, "HR", "Mumbai"));
		listEmpolyee.add(new Employee(14, "Sumit", 26, 40000, "Marketing", "Delhi"));
		listEmpolyee.add(new Employee(15, "Raghav", 26, 60000, "Production", "Kolkata"));

		oos.writeObject(listStudent);
		oos1.writeObject(listEmpolyee);

		oos.flush();
		oos.close();

		System.out.println("Done...");

	}

}
