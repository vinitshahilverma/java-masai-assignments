package com.question1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) throws IOException {
		
         Path p = Paths.get(".");
         
        Stream<Path> str =  Files.list(p);
        
        str.forEach(s -> System.out.println(s));
	}

}
