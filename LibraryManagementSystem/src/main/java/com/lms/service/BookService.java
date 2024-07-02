package com.lms.service;

import java.util.List;

import com.lms.entity.Book;

public interface BookService {

	Book addBook(Book book);

	List<Book> getAllBooks();

	Book getBookById(int id);

	Book getBookByName(String name);

	List<Book> getBookByAuthour(String authour);

	void deleteBook(Book book);

	void deleteBookById(int id);

	Book updateBook(Book book);

	Book updateBookById(Book book, int id);

}
