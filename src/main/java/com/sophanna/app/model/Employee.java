package com.sophanna.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue //auto increment field
	private Long id;
	
	@NotEmpty
	private String name;
	
	@Range(min=1, max=150)
	private int age;

	public int getAge() {
		return age;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
