package com.question5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	
		FileInputStream  fis = new FileInputStream("D://studentdata.txt");
		
		ObjectInputStream ooi = new ObjectInputStream(fis);
		
		
		List<Student> list = (List<Student>)ooi.readObject();
		
		list.forEach(s -> System.out.println(s));
		
	
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D://studentdata.txt"));
		
		list.add(new Student(19,"ram",900,"ram@gmail.com","1239",new Address("UP","Ayodhya",828423)));
		
		oos.writeObject(list);
		
		System.out.println("Done..");

	}
 
}
