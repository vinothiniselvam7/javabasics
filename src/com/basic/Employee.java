package com.basic;

public class Employee {
	String firstname;
	String lastname;
	double salary;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public static void main(String args[]) {
		Employee e1=new Employee();
		Employee e2=new Employee();
		e1.setFirstname("vino");
		e1.setLastname("selvam");
		e1.setSalary(10000);
		e2.setFirstname("ravanya");
		e2.setLastname("megalai");
		e2.setSalary(100000);
		double salary=e1.getSalary()*1.1;
		
		System.out.println(e1.getFirstname());
		System.out.println(e1.getLastname());
		System.out.println(e1.getSalary());
		System.out.println(salary); 

}
}
