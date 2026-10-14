package com.dao;

import java.util.List;

import com.entity.Department;
import com.entity.Student;

public interface DepartmentDao {

	void saveDepartment(Department department);
	
	Department getDepartmentById(Integer id);
	
	List<Department> getAllDepartmants();
	
	void upateDepartment(Department department);
	
	void deleteDepartment(Integer id);
	
	void addStudent(Integer depId, Student student);
}
