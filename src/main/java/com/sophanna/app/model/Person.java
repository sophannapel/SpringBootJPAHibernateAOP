package com.sophanna.app.model;

import org.springframework.stereotype.Component;

@Component
public class Person {

	private String name;
	private int age;

	public Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void printPerson() {
		System.out.println("you are human");
	}
}
