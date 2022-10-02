package com.question1;

public class Main {
	
	public Object[] changeArray(Object[] arr) {
		
		Object[] arr1 = new Object[4];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] instanceof Student) {
			     Student s1 = new Student();
			     s1.setRoll(23);
			      s1.setName("rakesh");
				s1.setMarks(460);
				arr1[0] = s1;
			}
			else if(arr[i] instanceof Employee) {
				Employee e1 = new Employee();
				e1.setId(12);
				e1.setName("Lokesh");
				e1.setSalary(94000);
				arr1[1] = e1;
			}
			else if(arr[i] instanceof String) {
				
				String original = "String";
				  
				StringBuilder sb = new StringBuilder("");
					
			    char[] ch = original.toCharArray();
			    
			    for(int j=ch.length-1; j>=0; j--) {
			    	sb.append(ch[j]);
			    }
			    
			        arr1[2]  = sb.toString();
			}
			else{
				arr1[3] = 70;
			}
		}
		return arr1;
		
	}

	public static void main(String[] args) {
		  
		 Student s1 = new Student(23,"rakesh",450);
		 
		 Employee e1 = new Employee(12,"Lokesh",84000);
		 
		 Object[] arr = new Object[4];
		 
		 arr[0] = s1;
		 arr[1] = e1;
		 arr[2] = "String";
		 arr[3] = 50;
		 
		 Main m1 = new Main();
		 
		  Object[] arr3 = m1.changeArray(arr);
		  
		 System.out.println(arr3[0]);
		 System.out.println(arr3[1]);
		 System.out.println(arr3[2]);
		 System.out.println(arr3[3]);
	}

}
