package com.ems.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.model.Employee;
import com.ems.repository.EmpRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmpRepository empRepository;

	@Override
	public List<Employee> getAllEmployee() {
		return empRepository.findAll();
	}

	@Override
	public void saveEmployee(Employee employee) {
		this.empRepository.save(employee);
	}

	@Override
	public Employee getEmployeeByd(long id) {
		Optional<Employee> optional = empRepository.findById(id);
		Employee employee = null;
		if (optional.isPresent()) {
			employee = optional.get();
		} else {
			throw new RuntimeException("Employee not found with id :: " + id);
		}
		return employee;
	}
}
