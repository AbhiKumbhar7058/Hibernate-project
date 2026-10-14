package com.app;

import java.util.List;
import java.util.Scanner;

import com.dao.StudentDao;
import com.dao.StudentDaoImpl;
import com.entity.Student;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		StudentDao studentDao = new StudentDaoImpl();

		int choice;

		do {

			System.out.println("\n===== STUDENT MENU =====");
			System.out.println("1. Save Student");
			System.out.println("2. Read Student");
			System.out.println("3. Update Student");
			System.out.println("4. Delete Student");
			System.out.println("5. Read All Students");
			System.out.println("6. Exit");

			System.out.print("Enter Choice: ");
			choice = sc.nextInt();

			switch (choice) {

			case 1:

				Student s1 = new Student();

				System.out.print("Enter Name: ");
				sc.nextLine();
				s1.setName(sc.nextLine());

				System.out.print("Enter Marks: ");
				s1.setMarks(sc.nextDouble());

				studentDao.saveStudent(s1);

				System.out.println("Student Saved Successfully");
				System.out.println("Generated ID: " + s1.getId());

				break;

			case 2:

				System.out.print("Enter Student ID: ");
				int id = sc.nextInt();

				Student student = studentDao.getStudentById(id);

				if (student != null)
					System.out.println(student);
				else
					System.out.println("Student Not Found");

				break;

			case 3:

				System.out.print("Enter Student ID: ");
				int updateId = sc.nextInt();

				Student updateStudent = studentDao.getStudentById(updateId);

				if (updateStudent != null) {

					System.out.print("Enter New Name: ");
					sc.nextLine();
					updateStudent.setName(sc.nextLine());

					System.out.print("Enter New Marks: ");
					updateStudent.setMarks(sc.nextDouble());

					studentDao.updateStudent(updateStudent);

					System.out.println("Student Updated");

				} else {
					System.out.println("Student Not Found");
				}

				break;

			case 4:

				System.out.print("Enter Student ID: ");
				int deleteId = sc.nextInt();

				Student deleteStudent = studentDao.getStudentById(deleteId);

				if (deleteStudent != null) {

					studentDao.deleteStudent(deleteStudent);

					System.out.println("Student Deleted");

				} else {
					System.out.println("Student Not Found");
				}

				break;

			case 5:

				List<Student> list = studentDao.getAllStudent();

				System.out.println("\nAll Students");

				for (Student stud : list) {
					System.out.println(stud);
				}

				break;

			case 6:

				System.out.println("Application Closed");
				break;

			default:

				System.out.println("Invalid Choice");
			}

		} while (choice != 6);

		sc.close();
	}
}