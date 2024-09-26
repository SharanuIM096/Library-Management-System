package com;

import java.util.List;
import java.util.Scanner;

public class LibraryApp {

	    private static Library library=new Library();
		private static Scanner sc= new Scanner(System.in);
	

	
	public static void main(String[] args) {
	
		while(true) {
		        System.out.println("1. Add Book");
	            System.out.println("2. Display All Book");
	            System.out.println("3. Borrow a Book");
	            System.out.println("4. Return a Book");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            
	            int choice =sc.nextInt();
	            sc.nextLine();
	            
	            switch(choice) {
	            
	            case 1: addBook();
	            break;
	            
	            case 2: displayAllBooks();
	            break;
	            
	            case 3: barrowABook();
	            break;
	            
	            case 4: returnBook();
	            break;
	            
	            case 5:
	            	System.exit(0);
	            	break;
	            	
	            	default:System.out.println("inavalid choice");
	
	            
	            }
		}
	}
		
		public static void addBook() {
			System.out.println("Enter the Book Id");
        	int id=sc.nextInt();
        	sc.nextLine();
        	System.out.println("Enter the Book Title");
            String title=sc.nextLine();
            System.out.println("Enter the author");
            String author=sc.nextLine();
            Book b=new Book(id, title, author);
            library.addBook(b);
			
		}
		
		public static void displayAllBooks() {
			library.displayAllBooks();
		}
		
		public static void barrowABook() {
			System.out.println("enter the Book you want to barrow");
			String title=sc.nextLine();	
			boolean found=false;
			List<Book> lib=library.getAllBooks();
			for(Book book:lib) {
				if(book.getTitle().equalsIgnoreCase(title)&&book.isAvailable()) {
					library.barrowBook(book);
					found=true;
					break;
				}
			}
			if(!found) {
				System.out.println("Book not found or unavailable.");
			}
		
		}
		
		public static void returnBook() {
			System.out.println("enter the book title to return ");
			String title=sc.nextLine();
			List<Book> lib=library.getAllBooks();
			boolean found=false;
			
			for(Book book:lib) {
				if(book.getTitle().equalsIgnoreCase(title)&&book.isAvailable()==false) {
					library.returnBook(book);
					found=true;
				}
				  if (!found) {
			            System.out.println("Book not found or already returned.");
			        }
			}
		}
		
	
}

