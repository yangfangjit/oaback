package com.banana.oaback.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.banana.oaback.entity.Employee;

public interface EmployeeDao {
	
	int insertEmployee(@Param("name") String name, @Param("age") short age);
	
	int insertEmployees(List<Employee> employees);
	
<<<<<<< HEAD
	int updateEmployees(List<Employee> employees);
	
=======
>>>>>>> branch 'master' of https://github.com/yangfangjit/oaback.git
	List<Employee> queryAll(@Param("offset") int offset,@Param("limit") int limit);
}
