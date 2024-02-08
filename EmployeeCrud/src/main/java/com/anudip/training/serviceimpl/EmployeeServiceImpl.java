package com.anudip.training.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.anudip.training.entity.Employee;
import com.anudip.training.repository.EmployeeRepository;
import com.anudip.training.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee addEmployee(Employee emp) {
		return employeeRepository.save(emp);
	}

	@Override
	public Employee getEmployeeById(int id) {
		Optional<Employee> optionalEmployee = employeeRepository.findById(id);
		return optionalEmployee.orElse(null);
	}

	@Override
	public Employee deleteEmployee(Employee emp) {
		employeeRepository.delete(emp);
		return emp;
	}

	@Override
	public Employee updateEmployee(int id) {
		Optional<Employee> optionalEmployee = employeeRepository.findById(id);
		if (optionalEmployee.isPresent()) {
			Employee existingEmployee = optionalEmployee.get();
			existingEmployee.setUpdated(true);
			return employeeRepository.save(existingEmployee);
		}
		return null;
	}

}
