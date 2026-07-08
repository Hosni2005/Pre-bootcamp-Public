package com.axsosacademy.bookapi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.axsosacademy.bookapi.models.Book;
import com.axsosacademy.bookapi.services.BookService;

@Controller
public class BookController {
	private final BookService bookservice;

	public BookController(BookService bookservice) {
		this.bookservice = bookservice;
	}
	
	
	@GetMapping("/show/{id}")
	public String show(@PathVariable Long id , Model model) {
		Book book = bookservice.findBook(id);
		 
        model.addAttribute("book", book);
		return "show";
	}
}
