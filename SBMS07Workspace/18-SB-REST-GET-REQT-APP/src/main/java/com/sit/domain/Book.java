package com.sit.domain;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Book {
	
	private Integer bookId;
	private String bookName;
	private String bookAuthor;
	private Double bookAmount;
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", bookAmount="
				+ bookAmount + "]";
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public Double getBookAmount() {
		return bookAmount;
	}
	public void setBookAmount(Double d) {
		this.bookAmount = d;
	}

}
