package com.anudip.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anudip.training.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
