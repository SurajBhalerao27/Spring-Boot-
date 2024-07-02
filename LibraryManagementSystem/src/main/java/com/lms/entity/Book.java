package com.lms.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Book_Table")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "Book_Name", length = 100, nullable = false)
	private String bookName;

	@Column(name = "Type", length = 100, nullable = false)
	private String bookType;

	@Column(name = "Author", length = 100, nullable = false)
	private String bookAuthor;

	@Column(name = "Publication", length = 100, nullable = false)
	private String bookPublication;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "member_id")
	private Member member;

	public Book() {
		super();
	}

	public Book(String bookName, String bookType, String bookAuthor, String bookPublication, Member member) {
		super();
		this.bookName = bookName;
		this.bookType = bookType;
		this.bookAuthor = bookAuthor;
		this.bookPublication = bookPublication;
		this.member = member;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookPublication() {
		return bookPublication;
	}

	public void setBookPublication(String bookPublication) {
		this.bookPublication = bookPublication;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

}
