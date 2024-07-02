package com.lms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.entity.Book;
import com.lms.repository.BookRepo;
import com.lms.service.BookService;

@Service
public class BookServiceImpl implements BookService {
	@Autowired
	BookRepo bookrepo;

	@Override
	public Book addBook(Book book) {
		return bookrepo.save(book);
	}

	@Override
	public List<Book> getAllBooks() {
		return bookrepo.findAll();
	}

	@Override
	public Book getBookById(int id) {
		return bookrepo.findById(id).orElse(null);
	}

	@Override
	public Book getBookByName(String name) {
		return bookrepo.findBookByName(name);
	}

	@Override
	public List<Book> getBookByAuthour(String authour) {
		return bookrepo.findBookByAuthour(authour);
	}

	@Override
	public void deleteBook(Book book) {
		bookrepo.delete(book);
	}

	@Override
	public void deleteBookById(int id) {
		bookrepo.deleteById(id);
	}

	@Override
	public Book updateBook(Book book) {
		Book updatedBook = null;
		updatedBook.setBookName(book.getBookName());
		updatedBook.setBookAuthor(book.getBookAuthor());
		updatedBook.setBookType(book.getBookType());
		updatedBook.setBookPublication(book.getBookPublication());
		updatedBook.setMember(book.getMember());
		return bookrepo.save(updatedBook);
	}

	@Override
	public Book updateBookById(Book book, int id) {
		Book updatedBook = bookrepo.findById(id).orElse(null);
		updatedBook.setBookName(book.getBookName());
		updatedBook.setBookAuthor(book.getBookAuthor());
		updatedBook.setBookType(book.getBookType());
		updatedBook.setBookPublication(book.getBookPublication());
		updatedBook.setMember(book.getMember());
		return bookrepo.save(updatedBook);
	}

}
