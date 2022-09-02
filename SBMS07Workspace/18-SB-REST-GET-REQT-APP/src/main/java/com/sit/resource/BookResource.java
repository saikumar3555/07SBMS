package com.sit.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sit.domain.Book;

@RestController
public class BookResource {
	
	
	@GetMapping(value = "/bookDtls", produces = {"application/json", "application/xml"})
	public Book getBookDetails() {
		// Logic from DB
		
		Book b= new Book();
		b.setBookId(1006);
		b.setBookName("Spring");
		b.setBookAuthor("Rod Johnson");
		b.setBookAmount(100.00);
		return b;
	}

}
