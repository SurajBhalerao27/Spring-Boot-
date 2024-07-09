package com.anudip.sb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.anudip.sb.entity.Teacher;
import com.anudip.sb.service.TeacherService;

//handle all incoming request of Teacher Entity
@RestController
public class TeacherController {

	@Autowired
	TeacherService ts;

	//use post mapping to insert data
	@PostMapping("/Teacher/addTeacher")
	public ResponseEntity<Teacher> saveTeacher(@RequestBody Teacher teacher){
		return new ResponseEntity<>(ts.addTeacher(teacher),
				HttpStatus.CREATED);
	}

	//use get mapping to fetch data from db table
	@GetMapping("/Teacher/getTeacher/{tid}")
	public ResponseEntity<Teacher> getTeacher(@PathVariable("tid") int tid){
		return new ResponseEntity<>(ts.getTeacherDetail(tid),HttpStatus.OK);
	}

	//use put mapping to edit existing data
	@PutMapping("/Teacher/editTeacher/{tid}")
	public ResponseEntity<Teacher> editTeacher(@PathVariable("tid") int tid, @RequestBody Teacher teacher){
		return new ResponseEntity<>(ts.updateTeacherDetail(teacher, tid), HttpStatus.OK);
	}


	//use delete mapping to remove existing data
	@DeleteMapping("Teacher/removeTeacher/{tid}")
	public ResponseEntity<String> deleteTeacher(@PathVariable("tid") int tid){
		ts.deleteTeacherDetail(tid);
		return new ResponseEntity<>("Deleted Successfully..", HttpStatus.OK);
	}

//	@GetMapping("Teacher/getTName/{tname}")
	public List<Teacher> getTeacherName(@PathVariable("tname") String tname){
		return ts.getTeacherByName(tname);
	}

	@GetMapping("Teacher/getTPhone/{tphone}")
	public ResponseEntity<Teacher> getTeacherPhone(@PathVariable("tphone") long tphone){
		return new ResponseEntity<>(ts.getTeacherByPhone(tphone), HttpStatus.OK);
	}


	@GetMapping("Teacher/getTDesignation/{designation}")
	public List<Teacher> getTeacherDesignation(@PathVariable("designation") String designation){
		return ts.getTeacherdesignation(designation);
	}


}