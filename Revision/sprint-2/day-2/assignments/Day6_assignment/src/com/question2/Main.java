package com.question2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws IOException {
		
		
		Path  p  = Paths.get("./files/newFile.txt");
		
		Stream<String>  str  = Files.lines(p);
		
		str.forEach( s -> System.out.println(s));

	}

}
