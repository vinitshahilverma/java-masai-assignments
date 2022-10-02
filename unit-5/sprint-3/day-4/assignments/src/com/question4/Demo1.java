package com.question4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {

       
       
      List<Student> list = new ArrayList<>();
      
      list.add(new Student(10,"Shahil",200,new Address("Jharkhand","Bokaro",828404)));
      list.add(new Student(12,"vinit",400,new Address("Bihar","patna",8284504)));
      list.add(new Student(14,"vicky",800,new Address("Uk","Nainital",828484)));
      list.add(new Student(15,"Ssndy",600,new Address("Maharashtra","Mumbai",828564)));
      
      
      ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D://studentdata.txt"));
      
      oos.writeObject(list);
      
      oos.close();
      
      System.out.println("Done..");

	}

}
