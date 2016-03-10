package com.sophanna.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sophanna.app.model.Employee;

@Repository("employeeRepository")
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
//	List<Employee> getMyEmployee();
	//For this one we no need to put namequery to tell jpa, because we follow its convention as 
	//findBy then Name which is the property name of the class
	Employee findByNameLike(String name);
	
	Employee findByNameOrId(String name, Long id);
}
