package com.example.cms.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cms.dao.employee_dao;
import com.example.cms.entities.Employee;


@Service
public class employees_services_impl implements employees_services {

	@Autowired
	public employee_dao employeedao;
	
	//get all employee
	@Override
	public List<Employee> getEmployees() {
		return employeedao.findAll();
	}

	//get a single employee
	@Override
	public Optional<Employee> getEmployee(long employeeId) {	
		return employeedao.findById(employeeId);
	}

	//add an employee
	@Override
	public Employee addEmployee(Employee employee) {
		employeedao.save(employee);
		return employee;
	}

	//update an employee
	@Override
	public Employee updateEmployee(Employee employee) {
		employeedao.save(employee);
		return employee;
	}

	//delete an employee
	@Override
	public void deleteEmployee(long parseLong) {	
		employeedao.deleteById(parseLong);
	}
	
	
	

}
