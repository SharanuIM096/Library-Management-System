package com;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	private List<Book> books;
	
	public Library() {
		this.books=new ArrayList<>();
		
	}
	
	public void addBook(Book book) {
		books.add(book);
		System.out.println("Book Added to the Library " +book.getTitle());
		
	}
	public void displayAllBooks() {
		if(books.isEmpty()) {
			System.out.println("No Books available in the Library");
		}
		else {
			for(Book b:books) {
				System.out.println(b);
			}
		}
	}
	
	public List<Book> getAllBooks() {
		return books;
		
	}
	
	public void barrowBook(Book book) {
		if(book.isAvailable()) {
			book.barrowBook();
			System.out.println("you barrowed the book"+book.getTitle());
		}
		else {
			System.out.println("Sorry, this book is currently unavailable");
		}
	}
	public void returnBook(Book book) {
		book.returnBook();
		System.out.println(book.getTitle()+"book is recived");
	}

}
