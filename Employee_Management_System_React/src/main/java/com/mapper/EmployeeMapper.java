package com.mapper;

import com.ems.dto.EmployeeDto;
import com.ems.model.Employee;

public class EmployeeMapper {
	// function for convert employeeDTO to employee 
	public static EmployeeDto mapToEmployeeDto(Employee employee) {
		return new EmployeeDto(
				employee.getId(),
				employee.getFirstName(),
				employee.getLastName(),
				employee.getEmail()
		);
	}


	// function for convert employee to employeeDTO
	public static Employee mapToEmployee(EmployeeDto employeeDto) {
		
		return new Employee(
				employeeDto.getId(),
				employeeDto.getFirstName(),
				employeeDto.getLastName(),
				employeeDto.getEmail()
		);
	}
}
