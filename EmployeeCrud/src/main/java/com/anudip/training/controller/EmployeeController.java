package com.anudip.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anudip.training.entity.Employee;
import com.anudip.training.serviceimpl.EmployeeServiceImpl;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {
	@Autowired
	public EmployeeServiceImpl employeeServiceImpl;

	@PostMapping("/Employees")
	public Employee createEmployee(@RequestBody Employee emoloyee) {
		return employeeServiceImpl.addEmployee(emoloyee);
	}

	@GetMapping("/Employees")
	public List<Employee> getAllEmployee() {
		return employeeServiceImpl.findAll();
	}

	@GetMapping("/Employees/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		return employeeServiceImpl.getEmployeeById(id);
	}

	@PutMapping("/Employees")
	public ResponseEntity<Employee> deleteEmployee(Employee emp) {
		Employee employee = employeeServiceImpl.deleteEmployee(emp);
		return ResponseEntity.ok().body(employee);
	}

	@PutMapping("/Employees/{id}")
	public Employee updateEmployee(@PathVariable int id) {
		return employeeServiceImpl.updateEmployee(id);
	}
}
