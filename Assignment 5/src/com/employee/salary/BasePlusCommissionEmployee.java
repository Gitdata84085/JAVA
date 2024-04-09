package com.employee.salary;

import java.util.Scanner;

public class BasePlusCommissionEmployee extends CommissionEmployee{
	double baseSalary;
	
	@Override
	public void acceptData(Scanner sc) {
		super.acceptData(sc);
		System.out.println("Enter Base Salary: ");
		baseSalary= sc.nextDouble();
	}
	
	@Override
	public void displayEmployee() {
		super.displayEmployee();
		System.out.println("Base Salary: "+baseSalary);
	}
	
	@Override
	public double earnings() {
		return (commissionRate*grossSales)+baseSalary;
	}
	
	public double earningsPlusReward() {
		return (baseSalary+(baseSalary*0.1));
	}
	
}
