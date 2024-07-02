package com.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lms.entity.BorrowingCard;

public interface BorrowRepo extends JpaRepository<BorrowingCard, Integer>{

}
