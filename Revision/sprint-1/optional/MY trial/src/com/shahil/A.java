package com.shahil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class A {
	
  public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
	  
          ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.txt"));
          
          B b = new C();
          
          oos.writeObject(b);
          
          oos.flush();
          
          oos.close();
          
          System.out.println("Done");
          
          
          ObjectInputStream ooi = new ObjectInputStream(new FileInputStream("abc.txt"));
          
          B c = (B) ooi.readObject();
          
          System.out.println(c.x);
          
          
  }

}
