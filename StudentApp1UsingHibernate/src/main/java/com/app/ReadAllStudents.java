package com.app;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

import java.util.List;


public class ReadAllStudents {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		String hql = "FROM Student s";
		Query<Student> query = session.createQuery(hql);
		
		List<Student> list = query.list();
		
		for(Student student : list)
			System.out.println(student);
			
		session.close();
		
		sessionFactory.close();
	}
}
