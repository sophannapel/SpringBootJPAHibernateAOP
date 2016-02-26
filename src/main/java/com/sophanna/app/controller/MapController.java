package com.sophanna.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.sophanna.app.model.Person;
import com.sophanna.app.service.PersonService;

@Controller
public class MapController {

	@Autowired
	private PersonService personService;
	
	@RequestMapping("/hello/{name}")
	public @ResponseBody String hello(@PathVariable String name) {
		List<Person> list = personService.getAllPeople();
//		System.out.println(list.toString());
		return "Hello, " + name + "!";
	}

	@RequestMapping("/welcome")
	public @ResponseBody String home() {
		RestTemplate restTemplate = new RestTemplate();
		String url = "https://maps.googleapis.com/maps/api/geocode/json?address=1600+Amphitheatre+Parkway,+Mountain+View,+CA&key=AIzaSyC2k6TNrIQALpZq7dxzi4t0Pjj3ebgOhgQ";
		String list = restTemplate.getForObject(url, String.class);
		return list;
	}
	
//	public void printTest() {
//		
//	}
}
