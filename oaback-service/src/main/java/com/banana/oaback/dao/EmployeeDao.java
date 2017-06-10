package com.banana.oaback.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.banana.oaback.bean.Employee;

@Repository
public interface EmployeeDao {
	
	int insertEmployee(@Param("name") String name, @Param("age") short age);
	
	List<Employee> queryAll(@Param("offset") int offset,@Param("limit") int limit);
}
