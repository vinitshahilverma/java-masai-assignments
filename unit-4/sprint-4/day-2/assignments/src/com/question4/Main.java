package com.question4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Library l1 = new Library();

		
		
		int choice = 0;
         
		while(true) {
			
			System.out.println("===================================");
			
		Scanner sc = new Scanner(System.in);

		System.out.println("1.Add Book");
		System.out.println("2.Display all book details");
		System.out.println("3.Search Book by author");
		System.out.println("4.Count number of books-by book name");
		System.out.println("5.Exit");

		 choice = sc.nextInt();

		if (choice == 1) {
			System.out.println("Enter the isbn no:");
			int isbn = sc.nextInt();

			System.out.println("Enter the book name:");
			String name = sc.next();

			sc.nextLine();

			System.out.println("Enter the author name:");
			String author = sc.nextLine();
			
			Book b1 = new Book();

			b1.setIsbn(isbn);
			b1.setBookName(name);
			b1.setAuthor(author);

			l1.addBook(b1);
      
		}

		else if (choice == 2) {
			List<Book> books = new ArrayList<>();

			books = l1.viewAllBooks();

			if (books.size() == 0) {
				System.out.println("List is Empty");
			} else {
				for (int i = 0; i < books.size(); i++) {
					System.out.println(books.get(i));
				}
			}
		}

		else if (choice == 3) {
			List<Book> books = new ArrayList<>();

			System.out.println("Enter Author Name");
			
			sc.nextLine();
			
			String name = sc.nextLine();
			
			books = l1.viewBooksByAuthor(name);
			
			
            if(books.size()==0) {
            	System.out.println("None of the book published by the author " + name);
            }
			for (int i = 0; i < books.size(); i++) {
				System.out.println(books.get(i));
			}
		}

		else if (choice == 4) {

			System.out.println("Enter Book Name");

			int count = l1.countNoOfBook(sc.next());

			System.out.println(count);

		}

		else {
			System.out.println("Thank You..!");
			break;
		}
	  }
	}

}
