package com.way2learnoline;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Demo {

	public static void main(String[] args) {
	
		
		
		Address address=new Address(0,"banglore","india");
		
		
		Employee employee1=new Employee(124,"aaish",121212);
		
		Employee employee2=new Employee(125,"aaish",121212);
		
		employee1.setAddress(address);
		employee2.setAddress(address);
		Configuration configuration=new Configuration();
		configuration.configure(); //load hibernate.cfg.xml
		//hibernate.properties
		SessionFactory sessionFactory =configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		session.save(employee1);
		session.save(employee2);
		transaction.commit();
		session.close();
		sessionFactory.close();

	}

}
