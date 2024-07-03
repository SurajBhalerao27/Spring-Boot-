package com.anudip.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anudip.training.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {
//	List<Student> findByNameContaining(String name);
}
