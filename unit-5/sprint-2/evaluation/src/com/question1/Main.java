package com.question1;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("===================================================");
			
			System.out.println("Enter you choice");
			System.out.println("1.Add Book");
			System.out.println("2.Display all book Details");
			System.out.println("3.Search Book by author");
			System.out.println("4.Search Book by ISBN");
			System.out.println("5.Exit");
			
			int choice = sc.nextInt();
			
			if(choice==1) {
				
				try {
					System.out.println("Enter isbn no");
					int isbn = sc.nextInt();
					
					System.out.println("Enter Book name");
					String name = sc.next();
					
					sc.nextLine();
					
					System.out.println("Enter the author Name");
					
					String auName = sc.nextLine();
					
					Library l = new Library();
					
					l.addBook(new Book(isbn,name,auName));
					
				}
				catch (BookException be) {
					
					System.out.println(be.getMessage());
					
			    }
				
			}
			
			if(choice == 2) {
				try {
				Library l = new Library();
				
				List<Book> l1 = l.viewAllBooks();
				 
				    l1.stream().forEach(b->System.out.println(b));
						
				}
                 catch (BookException be) {
					
					System.out.println(be.getMessage());
					
			    }
				
			}
			
			if(choice == 3) {
				
				try {
					
					System.out.println("Enter Author Name");
					
					sc.nextLine();
					
					String name = sc.nextLine();
					
					Library l = new Library();
					
					List<Book> l1 = l.viewBooksByAuthor(name);
					
					l1.stream().forEach(b-> {
						
						System.out.println("ISBN no : " + b.getIsbn());
						System.out.println("Book Name : " + b.getBookName());
						System.out.println("Author Name : " + b.getAuthor());
						
					});
					
				}
				
                 catch (BookException be) {
					
					System.out.println(be.getMessage());
					
			    }
			}
			
			if(choice == 4) {
				
				try {
					
                   System.out.println("Enter ISBN no");
					
					int num = sc.nextInt();
					
					Library l1 = new Library();
					
					Book b = l1.getBookByISBN(num);
					
					System.out.println(b);
					
				}
				
                 catch (BookException be) {
					
					System.out.println(be.getMessage());
					
			    }
			}
			
			if(choice==5) {
				break;
			}
			
			
		}
          
		System.out.println("Thank You....!");
	}

}
