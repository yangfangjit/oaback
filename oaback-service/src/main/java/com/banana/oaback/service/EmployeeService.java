package com.banana.oaback.service;

import java.util.List;

import com.banana.oaback.entity.Employee;

public interface EmployeeService {

	int insertEmployee(Employee employee);
	
	List<Employee> queryAll(int offset, int limit);
}
