package com.springboot.thymeleaf.demo.service;

import java.util.List;

import com.springboot.thymeleaf.demo.entity.Employee;

public interface EmployeeService {
	
	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);

}
