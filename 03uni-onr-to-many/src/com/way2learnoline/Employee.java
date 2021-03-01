package com.way2learnoline;

import java.util.List;
import java.util.Set;

public class Employee {
	
	

	private int id;
	private String name;
	private int salary;
	
	private Set<Address> address;
	
	public Employee(){
		
	}

	public Employee(int id, String name, int salary, Set<Address> address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address=address;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}


	public Set<Address> getAddress() {
		return address;
	}

	public void setAddress(Set<Address> address) {
		this.address = address;
	}

}
