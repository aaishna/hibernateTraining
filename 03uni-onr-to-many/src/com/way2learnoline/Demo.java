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
	
		
		
		//Address address=new Address("banglore","india");
		Set<Address> address = new HashSet<>();
		address.add(new Address("punjab","India",122));
		address.add(new Address("england","India",132));
		
		
		
		Employee employee=new Employee(126,"aaishna",121212,address);
		
		Configuration configuration=new Configuration();
		configuration.configure(); //load hibernate.cfg.xml
		//hibernate.properties
		SessionFactory sessionFactory =configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		session.save(employee);
		
		transaction.commit();
		session.close();
		sessionFactory.close();

	}

}
