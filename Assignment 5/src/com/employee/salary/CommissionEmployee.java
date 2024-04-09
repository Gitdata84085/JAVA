package com.employee.salary;

import java.util.Scanner;

public class CommissionEmployee extends Employee{
	double grossSales;
	double commissionRate;
	
	@Override
	public void acceptData(Scanner sc) {
		super.acceptData(sc);
		System.out.println("Enter gross sales: ");
		grossSales= sc.nextDouble();
		System.out.println("Enter commission rate: ");
		commissionRate= sc.nextDouble();
	}
	
	@Override
	public void displayEmployee() {
		super.displayEmployee();
		System.out.println("Gross Sales: "+grossSales);
		System.out.println("Commission Rate: "+commissionRate);		
	}
	
	@Override
	public double earnings() {
		return commissionRate * grossSales;
	}

}
