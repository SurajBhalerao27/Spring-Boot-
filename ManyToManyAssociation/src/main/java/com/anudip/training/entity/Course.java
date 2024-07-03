package com.anudip.training.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String courseName;
	private double price;

	@ManyToMany(mappedBy = "course", fetch = FetchType.LAZY)
	private List<Student> student;

	public Course() {
		super();
	}

	public Course(int id, String courseName, double price, List<Student> student) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.price = price;
		this.student = student;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + ", price=" + price + ", student=" + student + "]";
	}
}
