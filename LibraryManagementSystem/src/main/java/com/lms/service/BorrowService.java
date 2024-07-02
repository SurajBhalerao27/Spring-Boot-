package com.lms.service;

import java.util.List;

import com.lms.entity.BorrowingCard;

public interface BorrowService {

	BorrowingCard addBorrowCard();

	BorrowingCard getBorrowCardById();

	List<BorrowingCard> getAllBorrowCards();

	void deleteBorrowCardById();

	BorrowingCard updateBorrowCardById();
}
