package com;

public class Book {
	
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", available=" + available + "]";
	}

	private int id;
	private String title;
	private String author;
	private boolean available;
	public Book(int id, String title, String author) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.available = true;;
	}
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public boolean isAvailable() {
		return available;
	}
	
    public void barrowBook() {
    	if(available) {
    		available=false;
    	}
    	else {
    		System.out.println("this book is currently not availabe");
    	}
    }
    
    public void returnBook() {
    	available=true;
    	
    }
    
	

}
