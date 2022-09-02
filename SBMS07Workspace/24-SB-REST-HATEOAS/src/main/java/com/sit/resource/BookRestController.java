package com.sit.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sit.bindings.Book;

@RestController
public class BookRestController {

	/*
	 * TO GET BOOK DETAILS BASED ON BOOK ID
	 */
	@GetMapping(value = "/getBook/{booid}", produces = {"application/json"})
	public Book getBookDtls(@PathVariable("booid") int bookId) {
		
		Book book = new Book( bookId,"Spring",123.00,"Rod Jhonson");
		Link withSelfRel = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(BookRestController.class).getAllBooks()).withSelfRel();
		book.add(withSelfRel);
		return book;
	}
	
	@GetMapping(value = "/allBooks",
			produces = {"application/json"})
	public List<Book> getAllBooks(){
		
		List booksList = new ArrayList();
		Book  book1 = new Book(102,"Spring",1132.00,"RodJohnson");
		Book  book2 = new Book(102,"Hibernate",1132.00,"Gavin king");
		Book  book3 = new Book(102,"Restful",1132.00,"rest author");
		Book  book4 = new Book(102,"webservice",1132.00,"web service author");
		
		booksList.add(book1);
		booksList.add(book2);
		booksList.add(book3);
		booksList.add(book4);
		
		return booksList;
	}
	
}
