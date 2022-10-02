package com.question1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.question2.Student;

public class Main implements Function< Student, String>{

	@Override
	public String apply(Student t) {
		if(t.getMarks()>500) {
			return "Yes";
		}
		else
			return "No";
	}

}
