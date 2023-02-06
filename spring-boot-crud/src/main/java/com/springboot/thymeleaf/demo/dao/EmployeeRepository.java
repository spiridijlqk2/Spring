package com.springboot.thymeleaf.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.thymeleaf.demo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	//add method to sort by last name
	public List<Employee> findAllByOrderByLastNameAsc();

}
