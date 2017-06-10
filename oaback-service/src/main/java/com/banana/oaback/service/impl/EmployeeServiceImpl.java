package com.banana.oaback.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banana.oaback.bean.Employee;
import com.banana.oaback.dao.EmployeeDao;
import com.banana.oaback.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	public int insertEmployee(Employee employee) {
		return employeeDao.insertEmployee(employee.getName(), employee.getAge());
	}

	@Override
	public List<Employee> queryAll(int offset, int limit) {
		return employeeDao.queryAll(offset, limit);
	}

}
