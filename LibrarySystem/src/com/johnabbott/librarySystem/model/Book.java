package com.johnabbott.librarySystem.model;

public class Book {
	
	String bookName;
	String bookType;
	String author;
	int year;
	
	public Book(String bookName, String bookType, String author, int year) {
		this.bookName = bookName;
		this.bookType = bookType;
		this.author = author;
		this.year = year;
	}
	
	public String getAuthor() {
		return author;
	}

	public int getYear() {
		return year;
	}

	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookType() {
		return bookType;
	}
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	
}
