package com.anudip.training.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.anudip.training.entity.Employee;

@Service
public interface EmployeeService {
	
	public List<Employee> findAll();

	public Employee addEmployee(Employee emp);

	public Employee getEmployeeById(int id);

	public Employee deleteEmployee(Employee emp);

	public Employee updateEmployee(int id);
}
