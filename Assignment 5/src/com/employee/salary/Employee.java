package com.employee.salary;

import java.util.Scanner;

public abstract class Employee {
	String firstName;
	String lastName;
	int ssn;
	
	public Employee() {
	}

	public Employee(String firstName, String lastName, int ssn) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
	}

	public void acceptData(Scanner sc) {
		System.out.println("Enter first name: ");
		firstName=sc.next();
		System.out.println("Enter last name: ");
		lastName=sc.next();
		System.out.println("Enter social security number: ");
		ssn=sc.nextInt();
	}
	
	public void displayEmployee() {
		System.out.println("First name: "+firstName);
		System.out.println("Last name: "+lastName);
		System.out.println("Social security number: "+ssn);
	}
	
	public abstract double earnings();
}
