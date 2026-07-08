package com.axsosacademy.bookapi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.axsosacademy.bookapi.models.Book;
import com.axsosacademy.bookapi.services.BookService;


@RestController
@RequestMapping("/api")
public class BooksApi {
private final BookService bookService;




    public BooksApi(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public List<Book> index() {
        return bookService.allBooks();
    }

    @GetMapping("/books/{id}")
    public Book show(@PathVariable Long id) {
        return bookService.findBook(id);
    }

    @PostMapping("/books")
    public Book create(
            @RequestParam String title,
            @RequestParam String description,
            @RequestParam String language,
            @RequestParam Integer pages) {

        Book book = new Book(title, description, language, pages);
        return bookService.createBook(book);
    }

    @PutMapping("/books/{id}")
    public Book update(
            @PathVariable Long id,
            @RequestParam String title,
            @RequestParam String description,
            @RequestParam String language,
            @RequestParam Integer pages) {

        return bookService.updateBook(id, title, description, language, pages);
    }

    @DeleteMapping("/books/{id}")
    public void destroy(@PathVariable Long id) {
        bookService.deleteBook(id);
    }
}
