package com.anudip.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anudip.training.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

}
