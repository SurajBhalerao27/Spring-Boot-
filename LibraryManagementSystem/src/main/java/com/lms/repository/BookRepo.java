package com.lms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lms.entity.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {

	Book findBookByName(String name);

	List<Book> findBookByAuthour(String authour);
}
