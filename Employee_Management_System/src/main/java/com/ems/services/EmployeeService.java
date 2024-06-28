package com.ems.services;

import java.util.List;

import com.ems.model.Employee;

public interface EmployeeService {
	public List<Employee> getAllEmployee();

	void saveEmployee(Employee employee);

	Employee getEmployeeByd(long id);
}
