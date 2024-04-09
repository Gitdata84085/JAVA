package com.employee.salary;

import java.util.Scanner;

public class SalariedEmployee extends Employee{
	double weeklySalary;
	
	@Override
	public void acceptData(Scanner sc) {
		super.acceptData(sc);
		System.out.println("Enter weekly salary: ");
		weeklySalary= sc.nextDouble();		
	}
	
	@Override
	public void displayEmployee() {
		super.displayEmployee();
		System.out.println("Weekly Salary: "+weeklySalary);
	}

	@Override
	public double earnings() {
		return weeklySalary;
	}

}
