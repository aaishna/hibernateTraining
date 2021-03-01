package com.way2learnoline;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SelectDemo {

	public static void main(String[] args) {
	
		
		Set<Address> address = new HashSet<>();
		address.add(new Address("punjab","India",122));
		address.add(new Address("england","India",132));
		
		
		
		Employee employee=new Employee(126,"aaishna",121212,address);
		//employee.setAddress(address);
		Configuration configuration=new Configuration();
		configuration.configure(); //load hibernate.cfg.xml
	
		SessionFactory sessionFactory =configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();

		
		//---- apply conditions on employee table
		//String hql="from Employee";
		//String hql="from Employee e where e.id>123";
		//String hql="from Employee e where e.id>?";
		//String hql="from Employee e where e.id>? and e.name like ?";
		//String hql="from Employee e where e.id>:myId and e.name like :myPattern"; // name
		
		//---- apply condition on address table
		String hql="select e from Employee e join e.address a where a.city=:myCity";
		
		
		Query query=session.createQuery(hql);
		query.setString("myCity", "Delhi");
		List<Employee> employees=query.list(); // not get polymorphic data
		
		query.setFirstResult(0); //
		query.setMaxResults(2);// get only first two rows of data
		//query.setInteger(0, 123); //set positional parameter index
		//query.setString(1, "%a%"); //set positional parameters index
		//query.setInteger("myId", 123); //set positional parameters name 
		//query.setString("myPattern", "%a%");
		
		
		
		for(Employee emp:employees){
			System.out.println(emp);
		}
		
		transaction.commit();
		session.close();
		sessionFactory.close();

	}

}
