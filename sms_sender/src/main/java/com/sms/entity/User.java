package com.sms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "User")
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "User_id", length = 10)
	private int id;
	@Column(name = "User_name", length = 20)
	private String name;
	@Column(name = "User_email", length = 50)
	private String email;
	@Column(name = "User_mobile", length = 12)
	private long mobile;

	// Constructors
	public User() {
		super();
	}

	public User(String name, String email, long mobile) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}

	// Getters And Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", mobile=" + mobile + "]";
	}
}
