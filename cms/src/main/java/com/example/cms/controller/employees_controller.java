package com.example.cms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.cms.entities.Employee;
import com.example.cms.services.employees_services;

@RestController
public class employees_controller {
	
	@Autowired
	private employees_services employeesServices;
	
	@GetMapping("/employees")
	public List<Employee> getEmployees(){
		return this.employeesServices.getEmployees();
	}

	@GetMapping("/employees/{employeeId}")
	public Optional<Employee> getEmployee(@PathVariable String employeeId) {
		return this.employeesServices.getEmployee(Long.parseLong(employeeId));
	}
	
	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee employee) {
		return this.employeesServices.addEmployee(employee);
	}
	
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return this.employeesServices.updateEmployee(employee);
	}
	
	@DeleteMapping("/employees/{employeeId}")
	public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable String employeeId) {
		if(this.employeesServices.getEmployee(Long.parseLong(employeeId))==null)
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		else {
			this.employeesServices.deleteEmployee(Long.parseLong(employeeId));
			return new ResponseEntity<>(HttpStatus.OK);
		}
			
	}
	
}
