package com.banana.oaback.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import com.banana.oaback.entity.Employee;

public class EmployeeServiceTest extends BaseTest {
	
	private static final Logger logger = LoggerFactory.getLogger(EmployeeServiceTest.class);
	
	@Autowired
	private EmployeeService employeeService;

	@Test
	@Rollback
	@Transactional
	public void testEmployeeService() {
		String name = "yangfang";
		short age = 26;
		Employee employee = new Employee(name, age);
		
		employeeService.insertEmployee(employee);
		
		List<Employee> list = employeeService.queryAll(0, 100);
		
		logger.info(list.get(0).toString());
		
		assertEquals(name, list.get(0).getName());
		assertEquals(age, list.get(0).getAge());
	}

}
