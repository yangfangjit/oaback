package com.banana.oaback.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.banana.oaback.entity.Employee;

public interface EmployeeDao {
	
	int insertEmployee(@Param("name") String name, @Param("age") short age);
	
	int insertEmployees(List<Employee> employees);
	
	int updateEmployees(List<Employee> employees);
	
	List<Employee> queryAll(@Param("offset") int offset,@Param("limit") int limit);
}
