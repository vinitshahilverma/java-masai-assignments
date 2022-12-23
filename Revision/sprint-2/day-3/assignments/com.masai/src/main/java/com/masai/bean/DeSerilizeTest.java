package com.masai.bean;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class DeSerilizeTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("myStudent.txt"));

		ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("myEmployee.txt"));

		Object obj1 = ois.readObject();
		Object obj2 = ois1.readObject();

		List<Student> list1 = (List<Student>) obj1;
		List<Employee> list2 = (List<Employee>) obj2;

		list1.forEach(l -> System.out.println(l));
		list2.forEach(l -> System.out.println(l));

		ois.close();

	}

}
