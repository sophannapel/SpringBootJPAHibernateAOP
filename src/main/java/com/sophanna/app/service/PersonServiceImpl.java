package com.sophanna.app.service;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

import com.sophanna.app.model.Person;

@Service
public class PersonServiceImpl implements PersonService {

	@Override
	public List<Person> getAllPeople() {
		Person p = new Person("Apple", 23);
		Person p1 = new Person("Orange", 21);
		System.out.println("---------- you are in person servlce impules class");
		List<Person> list = Arrays.asList(p, p1);
		return list;
	}

}
