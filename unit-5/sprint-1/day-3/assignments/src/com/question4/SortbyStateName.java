package com.question4;

import java.util.Comparator;

public class SortbyStateName implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		
		return o2.compareTo(o1);
		
	}

}
