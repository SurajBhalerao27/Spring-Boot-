package com.anudip.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anudip.training.entity.Student;
import com.anudip.training.repository.CourseRepo;
import com.anudip.training.repository.StudentRepo;

@RestController
@RequestMapping("/student/course")
public class StudentCourseController {
	@Autowired
	private StudentRepo studentRepo;
	@Autowired
	private CourseRepo courseRepo;

	@PostMapping
	public Student saveStudentWithCourse(@RequestBody Student student) {
		Student s1 = studentRepo.save(student);
		return s1;
	}

	@GetMapping
	public List<Student> findAllStudent() {
		return studentRepo.findAll();
	}

	@GetMapping("/{id}")
	public Student findStudent(@PathVariable int id) {
		return studentRepo.findById(id).orElse(null);
	}

//	@GetMapping(name = "/{name}")
//	public List<Student> findStudentContainingByName(@PathVariable String name) {
//		return studentRepo.findByNameContaining(name);
//	}
}
