package com.sophanna.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.sophanna.app.model.Employee;
import com.sophanna.app.service.EmployeeService;

@Controller
public class MapController {

	@Autowired EmployeeService employeeService;
	
	@RequestMapping("/welcome")
	public @ResponseBody String home() {
		RestTemplate restTemplate = new RestTemplate();
		String url = "https://maps.googleapis.com/maps/api/geocode/json?address=1600+Amphitheatre+Parkway,+Mountain+View,+CA&key=AIzaSyC2k6TNrIQALpZq7dxzi4t0Pjj3ebgOhgQ";
		String list = restTemplate.getForObject(url, String.class);
		return list;
	}

	@RequestMapping("/showmap")
	public String showMap() {
		return "map01";
	}
	
	@RequestMapping("/viewallemployee")
	public @ResponseBody List<Employee> viewAllEmployee() {
		List<Employee> list = employeeService.getAll();
		return list;
	}
}
