package com.employee.salary;

import java.util.Scanner;

public class HourlyEmployee extends Employee {
	double wage;
	double hours;
	
	@Override
	public void acceptData(Scanner sc) {
		super.acceptData(sc);
		System.out.println("Enter wage: ");
		wage=sc.nextDouble();
		System.out.println("Enter hours: ");
		hours=sc.nextDouble();		
	}
	
	@Override
	public void displayEmployee() {
		super.displayEmployee();
		System.out.println("Hourly wage: "+wage);
		System.out.println("Hours worked: "+hours);
	}
	
	@Override
	public double earnings() {
		if(hours<=40)
			return wage*hours;
		else if (hours>40) {
			return 40*wage+(hours-40)*wage*1.5;
		}
		return 0;
	}

}
