package com.axsosacademy.bookapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axsosacademy.bookapi.models.Book;
import com.axsosacademy.bookapi.repository.BookRepository;

	@Service
	public class BookService {
		@Autowired
	    private BookRepository bookRepository;

	    public List<Book> allBooks() {
	        return (List<Book>) bookRepository.findAll();
	    }

	    public Book createBook(Book b) {
	        return bookRepository.save(b);
	    }

	    public Book findBook(Long id) {
	        Optional<Book> optionalBook = bookRepository.findById(id);

	        if (optionalBook.isPresent()) {
	            return optionalBook.get();
	        } else {
	            return null;
	        }
	    }

	    public Book updateBook(Long id, String title, String description,
	            String language, Integer numberOfPages) {

	        Book book = findBook(id);

	        if (book == null) {
	            return null;
	        }

	        book.setTitle(title);
	        book.setDescription(description);
	        book.setLanguage(language);
	        book.setNumberOfPages(numberOfPages);

	        return bookRepository.save(book);
	    }

	    public void deleteBook(Long id) {
	        bookRepository.deleteById(id);
	    }
	}

