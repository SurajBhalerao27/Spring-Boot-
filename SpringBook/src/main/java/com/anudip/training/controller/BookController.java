package com.anudip.training.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.anudip.training.entity.Book;
import com.anudip.training.repository.BookRepository;

@EnableWebMvc
@RestController
@RequestMapping("/book")
public class BookController {
	@Autowired
	BookRepository bookRepository;

	// http://localhost:8080/book/save
	// this is create operation
	@PostMapping("/save")
	public String insertBook(@RequestBody Book book) {
		bookRepository.save(book);
		return "Book Details Saved Successfully !!! ";
	}

	// this is read operation
	@GetMapping("/get")
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	// this is read operation
	@GetMapping("/get/{id}")
	public ResponseEntity<Optional<Book>> getByIdBook(@PathVariable int id) {
		Optional<Book> book1 = bookRepository.findById(id);
		return ResponseEntity.ok(book1);
	}

	// this is update operation
	@PutMapping("edit/{id}")
	public ResponseEntity<Book> editBook(@RequestBody Book book, @PathVariable int id) {
		Book newBook = bookRepository.findById(id).orElse(null), updatedBook;
		newBook.setBookName(book.getBookName());
		newBook.setBookAuthour(book.getBookAuthour());
		updatedBook = bookRepository.save(newBook);
		return ResponseEntity.ok(updatedBook);
	}

	// this is delete operation
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Book> deleteBook(@PathVariable int id) {
		bookRepository.deleteById(id);
		return ResponseEntity.ok(null);
	}
}
