package com.api.book.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.api.book.entities.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {
	public List<Book> findAll();

	public Book findById(int id);
}
