package com.sophanna.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sophanna.app.model.Employee;
import com.sophanna.app.repository.EmployeeRepository;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Employee save(Employee employee) {
		
		return employeeRepository.save(employee);
	}

	@Override
	@Transactional
	public List<Employee> getAll() {
		return employeeRepository.findAll();
	}
	

}
