package com.lms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lms.entity.Book;
import com.lms.serviceimpl.BookServiceImpl;

@RestController
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	BookServiceImpl bookServiceImpl;

	@PostMapping("/addbook")
	public Book addBook(@RequestBody Book book) {
		return bookServiceImpl.addBook(book);
	}

	@GetMapping("/getbooks")
	private List<Book> getBooks(Book book) {
		return bookServiceImpl.getAllBooks();
	}
}
