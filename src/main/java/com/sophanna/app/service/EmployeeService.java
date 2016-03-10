package com.sophanna.app.service;

import java.util.List;

import com.sophanna.app.model.Employee;

public interface EmployeeService {
	
	Employee save(Employee employee);
	List<Employee> getAll();
}
