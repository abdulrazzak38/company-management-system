package com.example.cms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cms.entities.Employee;

public interface employee_dao extends JpaRepository<Employee, Long>{
	
}
