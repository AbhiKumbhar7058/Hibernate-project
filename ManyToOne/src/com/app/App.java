package com.app;

import com.dao.DepartmentDao;
import com.dao.DepartmentDaoImpl;
import com.entity.Department;
import com.entity.Student;

public class App {

	public static void main(String[] args) {
		Student s1 = new Student("Kareena");
		Student s2 = new Student("Raveena");
		Student s3 = new Student("Sakeena");
		Student s4 = new Student("Aliya");
		Student s5 = new Student("Shruti");

		Department department1 = new Department("CS");
		Department department2 = new Department("ELECTRONICS");

		DepartmentDao dao = new DepartmentDaoImpl();
		dao.saveDepartment(department1);

		System.out.println("SAVE CS DEPT");
		dao.saveDepartment(department2);
		System.out.println("SAVE ELECTRONICS DEPT");

		System.out.println("-----------------------------");

		dao.addStudent(1, s1);
		System.out.println("||||||||||||||||||||||||||||||||||");
		dao.addStudent(1, s2);
		System.out.println("||||||||||||||||||||||||||||||||||");
		dao.addStudent(1, s3);
		System.out.println("||||||||||||||||||||||||||||||||||");
		dao.addStudent(2, s4);
		System.out.println("||||||||||||||||||||||||||||||||||");
		dao.addStudent(2, s5);
		System.out.println("***** END *****");

	}

}