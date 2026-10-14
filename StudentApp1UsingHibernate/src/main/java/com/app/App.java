package com.app;

import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

public class App {

	public static void main(String[] args) {
		System.out.println("Application Started");
		
		//Step 1
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		System.out.println("Cofigured Read 1");
		SessionFactory factory = cfg.buildSessionFactory();
		
		System.out.println("Session Factory");
		Student student = new Student();
		student.setId(1);
		student.setName("Aba");
		student.setMarks(98.5);
		
		Session session = factory.openSession();
		System.out.println("session Created - 3");
		
		//ADD UPDATE DELETE ---> Transaction 
		//SELECT no need of Transaction

		Transaction tx = session.beginTransaction();
		System.out.println("Transaction Created 4");
		
		//Ready To Add Update Delete --> Transaction 
		
		System.out.println("__________________________");
		session.save(student);
		System.out.println("___________________________");
		
		System.out.println("**------------------------**");
		
		tx.commit();
		System.out.println("_____________________________");
		System.out.println("Done");
		session.close();
		factory.close();
		
		System.out.println("END APPLICATION");

	}
}
