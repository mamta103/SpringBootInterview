package com.java4s.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java4s.app.repository.SpringJava4sDAO;
import com.java4s.model.Customer;

@RestController
public class SpringJava4sController {

	@Autowired
	private SpringJava4sDAO dao;
	
	/*@RequestMapping("/getcustInfo")
	public List<Customer> customerInformation(){
		List<Customer> customers= dao.isData();
		return customers;
	}*/
	@RequestMapping("/java4s-spring-boot-ex-tomcat")
	 public String customerInformation() {
	      return "Hey, I am from external tomcat";
	 }
	
}
