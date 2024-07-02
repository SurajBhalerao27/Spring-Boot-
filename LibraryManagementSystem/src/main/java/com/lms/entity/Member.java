package com.lms.entity;

import com.lms.constants.MembershipType;

import jakarta.persistence.*;

@Entity
@Table(name = "Member_Table")
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int memberId;

	@Column(name = "Member_Name", length = 100, nullable = false)
	private String memberName;

	@Enumerated(EnumType.STRING)
	@Column(name = "Membership_Type", length = 20, nullable = false)
	private MembershipType membershipType;

	@OneToOne(mappedBy = "member", cascade = CascadeType.ALL)
	private BorrowingCard borrowingCard;

	public Member() {
		super();
	}

	public Member(int memberId, String memberName, MembershipType membershipType, BorrowingCard borrowingCard) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.membershipType = membershipType;
		this.borrowingCard = borrowingCard;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public MembershipType getMembershipType() {
		return membershipType;
	}

	public void setMembershipType(MembershipType membershipType) {
		this.membershipType = membershipType;
	}

	public BorrowingCard getBorrowingCard() {
		return borrowingCard;
	}

	public void setBorrowingCard(BorrowingCard borrowingCard) {
		this.borrowingCard = borrowingCard;
	}

}
