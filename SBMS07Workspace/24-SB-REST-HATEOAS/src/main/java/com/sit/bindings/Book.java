package com.sit.bindings;

import org.springframework.hateoas.RepresentationModel;

public class Book extends RepresentationModel<Book>{

	
	private int bookId;
	private String bookName;
	private Double bookprice;
	private String bookAuthor;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Double getBookprice() {
		return bookprice;
	}
	public void setBookprice(Double bookprice) {
		this.bookprice = bookprice;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public Book(int bookId, String bookName, Double bookprice, String bookAuthor) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookprice = bookprice;
		this.bookAuthor = bookAuthor;
	}
	public Book() {
		super();
	}
	
}
