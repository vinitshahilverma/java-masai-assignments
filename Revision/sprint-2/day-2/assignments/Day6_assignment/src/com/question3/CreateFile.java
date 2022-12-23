package com.question3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CreateFile {
	
	public static void main(String[] args) throws IOException {
		
		
		Path p = Paths.get("./files");
		
		if(Files.exists(p)) {
			System.out.println("File is already Exist");
		}
		else {
			
			Path p2 = Files.createDirectories(p);
			
			System.out.println("Created a file at : " + p2);

		}
		
		Path p3 = Paths.get("./files/newFile.txt");
		
		if(Files.exists(p3)) {
			System.out.println("File is already Exist");
		}
		else {
			
			Path p2 = Files.createFile(p3);
			
			System.out.println("Created a file at : " + p2);

		}
		
		List<String> list = Arrays.asList("shahil","sumit","Yash","verma","Sandeep");
	
		
		Files.write(p3, list);
		
		System.out.println("...done");
		
	}

}
