package com.anudip.training.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "Trainer_Info")
public class Teacher {
	@Id
	private int tid;
	@Column(length = 25, nullable = false)
	@NotBlank(message = "Trainer's name cannot be blank")
	private String tName;
	@Column(length = 25, nullable = false)
	@NotBlank(message = "Trainer's Surname cannot be blank")
	private String tsurName;
	@Column(length = 25, nullable = false)
	@NotBlank(message = "Trainer's Email-Id cannot be blank")
	@Email(message = "Email id is not proper!")
	private String tEmail;
	@Column(length = 11, nullable = false, unique = true)
	@NotBlank(message = "Trainer's Mobile number cannot be blank")
	private long tMobile;
	@Column(length = 11, nullable = false)
	@NotBlank(message = "Trainer's Designation cannot be blank")
	private String designation;

	public Teacher() {
		super();
	}

	public Teacher(int tid, @NotBlank(message = "Trainer's name cannot be blank") String tName,
			@NotBlank(message = "Trainer's Surname cannot be blank") String tsurName,
			@NotBlank(message = "Trainer's Email-Id cannot be blank") @Email(message = "Email id is not proper!") String tEmail,
			@NotBlank(message = "Trainer's Mobile number cannot be blank") long tMobile,
			@NotBlank(message = "Trainer's Designation cannot be blank") String designation) {
		super();
		this.tid = tid;
		this.tName = tName;
		this.tsurName = tsurName;
		this.tEmail = tEmail;
		this.tMobile = tMobile;
		this.designation = designation;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	public String getTsurName() {
		return tsurName;
	}

	public void setTsurName(String tsurName) {
		this.tsurName = tsurName;
	}

	public String gettEmail() {
		return tEmail;
	}

	public void settEmail(String tEmail) {
		this.tEmail = tEmail;
	}

	public long gettMobile() {
		return tMobile;
	}

	public void settMobile(long tMobile) {
		this.tMobile = tMobile;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", tName=" + tName + ", tsurName=" + tsurName + ", tEmail=" + tEmail
				+ ", tMobile=" + tMobile + ", designation=" + designation + "]";
	}
}
