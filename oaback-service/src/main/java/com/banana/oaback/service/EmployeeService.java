package com.banana.oaback.service;

import java.util.List;

import com.banana.oaback.entity.Employee;

public interface EmployeeService {

	int insertEmployee(Employee employee);
	
	int insertEmployees(List<Employee> employees);
	
	int updateEmployees(List<Employee> employees);
	
	List<Employee> queryAll(int offset, int limit);
}
