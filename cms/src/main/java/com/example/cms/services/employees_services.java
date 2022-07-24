package com.example.cms.services;

import java.util.List;
import java.util.Optional;

import com.example.cms.entities.Employee;

public interface employees_services {
	public List<Employee> getEmployees();
	public Optional<Employee> getEmployee(long employeeId);
	public Employee addEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public void deleteEmployee(long parseLong);
	
}
