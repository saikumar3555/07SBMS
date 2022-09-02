package com.sit.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sit.Entity.Book;

@Controller
public class BookController {
	
	
	@GetMapping("/bookdata")
	public String getBookData(Model model) {
		Book b=new Book();
		b.setBookId(101);
		b.setBookName("Claen Code");
		b.setBookPrice(100.00);
		b.setBookQuantity(19);
		model.addAttribute("book", b);
		
		
		return "bookDetails";
	}
	
	@GetMapping("/store")
	public ModelAndView getStoreDetails() {
		ModelAndView mav=new ModelAndView();
		String storeDtls="Karimnagr near new busstand";
		mav.addObject("storeDtls",storeDtls);
		mav.setViewName("bookDetails");
		return mav;
		
	}

}
