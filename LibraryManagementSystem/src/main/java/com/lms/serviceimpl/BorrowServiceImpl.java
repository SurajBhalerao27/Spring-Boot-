package com.lms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.lms.entity.BorrowingCard;
import com.lms.repository.BorrowRepo;
import com.lms.service.BorrowService;

public class BorrowServiceImpl implements BorrowService {
	@Autowired
	BorrowRepo borrowrepo;

	@Override
	public BorrowingCard addBorrowCard() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BorrowingCard getBorrowCardById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BorrowingCard> getAllBorrowCards() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteBorrowCardById() {
		// TODO Auto-generated method stub

	}

	@Override
	public BorrowingCard updateBorrowCardById() {
		// TODO Auto-generated method stub
		return null;
	}

}
