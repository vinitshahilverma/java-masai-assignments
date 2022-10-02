package com.question3;

import java.util.Comparator;

public class SortById implements Comparator<Library> {

	@Override
	public int compare(Library l1, Library l2) {
		
		return l1.getBookId()>l2.getBookId() ? 1: l2.getBookId()>l1.getBookId() ? -1: 0;
	}
	
	

}
