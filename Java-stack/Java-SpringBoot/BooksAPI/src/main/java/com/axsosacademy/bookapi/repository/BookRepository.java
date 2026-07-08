package com.axsosacademy.bookapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsosacademy.bookapi.models.Book;
@Repository
public interface BookRepository extends CrudRepository<Book, Long>{
	

}
