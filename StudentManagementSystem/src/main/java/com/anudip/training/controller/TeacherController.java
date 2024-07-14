package com.anudip.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.anudip.training.entity.Teacher;
import com.anudip.training.service.TeacherService;

@RestController
public class TeacherController {
	@Autowired
	TeacherService ts;

	@PostMapping("Teacher/addTeacher")
	public ResponseEntity<Teacher> saveTeacher(@RequestBody Teacher teacher) {
		return new ResponseEntity<Teacher>(ts.addTeacher(teacher), HttpStatus.OK);
	}

	@GetMapping("Teacher/getTeacher/{tid}")
	public ResponseEntity<Teacher> getTeacher(@PathVariable("tid") int tid) {
		return new ResponseEntity<Teacher>(ts.getTeacherDetails(tid), HttpStatus.OK);
	}

	@PutMapping("Teacher/editTeacher/{tid}")
	public ResponseEntity<Teacher> editTeacher(@PathVariable("tid") int tid, @RequestBody Teacher teacher) {
		return new ResponseEntity<Teacher>(ts.updateTeacherDetails(teacher, tid), HttpStatus.OK);
	}

	@PutMapping("Teacher/deleteTeacher/{tid}")
	public ResponseEntity<String> deleteTeacher(@PathVariable("tid") int tid) {
		ts.deleteTeacherDetails(tid);
		return new ResponseEntity<String>("Deleted Successfully !", HttpStatus.OK);
	}

}
