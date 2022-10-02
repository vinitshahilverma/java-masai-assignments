package com.question3;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	
	public static void doTransactions(List<? extends Payment> list) {
		
	     if(list instanceof CashPayment) {	    	
	    	 for(int i=0; i<list.size(); i++) {
	    		 list.get(i).doPayment();
	    	 }
	     }
    else if(list instanceof CardPayment) {
   	 for(int i=0; i<list.size(); i++) {
   		 list.get(i).doPayment();
   	  }
    }
		
		
	}

	public static void main(String[] args) {
		
		
		List<CashPayment> l1 = new ArrayList<>();
		l1.add(new CashPayment(6000));
		l1.add(new CashPayment(9000));
		
		doTransactions(l1);
		
		
		List<CardPayment> l2 = new ArrayList<>();
		l2.add(new CardPayment(8000));
		l2.add(new CardPayment(7000));
		
		doTransactions(l2);

	}

}
