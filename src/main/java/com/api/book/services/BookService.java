package com.api.book.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.book.dao.BookRepository;
import com.api.book.entities.Book;

@Component
public class BookService {

	@Autowired
	BookRepository bookRepository;

//	private static List<Book> list = new ArrayList<>();
//
//	static {
//		list.add(new Book(123, "Java Complete Reference", "Herbert Schildt"));
//		list.add(new Book(12, "ANSI C", "Balagurusamy"));
//		list.add(new Book(1, "Let us C", "Yashwant Kanethkar"));
//	}

	// get all books
	public List<Book> getAllBooks() {
//		return list;
		return this.bookRepository.findAll();
	}

	// get single book by id
	public Book getBookById(int id) {
//		for (Book b : list) {
//			if (b.getId() == id) {
//				return b;
//			}
//		}
//		return null;
		return this.bookRepository.findById(id);
	}

	// add book
	public void addBook(Book b) {
//		list.add(b);
		Book result = bookRepository.save(b);
	}

	// delete single book
	public void deleteBook(int bookId) {
//		Book book = null;
//		for (Book b : list) {
//			if (b.getId() == bookId) {
//				book = b;
//			}
//		}
//		System.out.println(book);
//		list.remove(book);
		this.bookRepository.deleteById(bookId);
	}

	public void updateBook(Book book, int bookId) {
//		for (Book b : list) {
//			if (b.getId() == bookId) {
//				b.setTitle(book.getTitle());
//				b.setAuthor(book.getAuthor());
//				System.out.println(b);
//			}
//		}
		book.setId(bookId);
		this.bookRepository.save(book);
	}
}
