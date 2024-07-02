package com.lms.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "Borrowing_Card")
public class BorrowingCard {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int borrowingCardId;

	@Column(name = "Start_Date", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date startDate;

	@Column(name = "End_Date", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date endDate;

	@OneToOne
	@JoinColumn(name = "member_id")
	private Member member;

	public BorrowingCard() {
		super();
	}

	public BorrowingCard(int borrowingCardId, Date startDate, Date endDate, Member member) {
		super();
		this.borrowingCardId = borrowingCardId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.member = member;
	}

	public int getBorrowingCardId() {
		return borrowingCardId;
	}

	public void setBorrowingCardId(int borrowingCardId) {
		this.borrowingCardId = borrowingCardId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

}
