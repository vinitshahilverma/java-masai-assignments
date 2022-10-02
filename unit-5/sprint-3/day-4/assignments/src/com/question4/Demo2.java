package com.question4;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream("D://studentdata.txt");
        
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        List<Student> list = (List<Student>)ois.readObject();
        
        list.forEach(s -> System.out.println(s));
        
	}

}
