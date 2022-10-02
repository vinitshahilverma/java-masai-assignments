package com.question4;

import java.util.Comparator;

public class SortByMarks implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getMarks()>o2.getMarks() ? 1 : -1;
		
	}

}
