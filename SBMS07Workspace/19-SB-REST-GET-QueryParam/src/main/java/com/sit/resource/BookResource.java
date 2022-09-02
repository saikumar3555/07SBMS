package com.sit.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sit.domain.Book;

@RestController
public class BookResource {
	 public BookResource() {
		System.out.println("res boj");
	}
	
	@GetMapping(value = "/getBook" , 
			produces = {"application/xml", "application/json"}
			)
	public Book getBookDtlsBasedOnBookId(@RequestParam("bookId") Integer bookId) {
		Book b =null;
		if(bookId == 101) {
			 b = new Book(bookId, "Spring", "Rod Jhonson", 123.00);
		}
		else if(bookId == 102) {
			 b = new Book(bookId, "Web services", "wb AUthor", 223.00);
		}else {
			 b = new Book(bookId, "Web services", "wb AUthor", 223.00);
		}
		
		return b;
	}
	
	@GetMapping("/bookAuth")
	public String getBookAuthor(Integer bookId, String bookName) {
		String bookAuth="";
		if( "Spring".equals(bookName)) {
			bookAuth="Rod jhonson";
		}else {
			bookAuth="no books";
		}
		return bookAuth;
	}

}
