package com.question5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) throws IOException {

       FileOutputStream fos = new FileOutputStream("D://studentdata.txt");
       
       ObjectOutputStream oos = new ObjectOutputStream(fos);
       
       List<Student> list = new ArrayList<>();
       
       list.add(new Student(10,"Shahil",400,"shahil@gmail.com","123",new Address("Jharkhand","Bokaro",828404)));
       list.add(new Student(12,"Verma",500,"verma@gmail.com","1234",new Address("Bihar","Patna",828405)));
       list.add(new Student(13,"Sandy",600,"sandy@gmail.com","1235",new Address("Maharashtra","Mumbai",828406)));
       list.add(new Student(15,"vicky",300,"vicky@gmail.com","1236",new Address("WB","Kolkata",828407)));
       list.add(new Student(18,"vinit",700,"vinit@gmail.com","1237",new Address("Gujarat","Surat",828408)));
       
       oos.writeObject(list);
       
       oos.close();
       
       System.out.println("Done....");
       

	}

}
