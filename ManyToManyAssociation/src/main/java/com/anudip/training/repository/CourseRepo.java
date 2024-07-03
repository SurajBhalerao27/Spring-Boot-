package com.anudip.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anudip.training.entity.Course;

public interface CourseRepo extends JpaRepository<Course, Integer> {

}
