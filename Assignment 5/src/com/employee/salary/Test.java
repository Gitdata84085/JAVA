//Q1) A company pays its employees on a weekly basis. The employees are of four types:
//Salaried employees are paid a fixed weekly salary regardless of the number of hours worked.
//Hourly employees are paid by the hour and receive overtime pay (i.e., 1.5 times their hourly salary
//rate) for all hours worked in excess of 40 hours.
//Commission employees are paid a percentage of their sales.
//Base-salaried commission employees receive a base salary plus a percentage of their sales.
//For the current pay period, the company has decided to reward salaried-commission employees by
//adding 10% to their base salaries. The company wants to write an application that performs its
//payroll calculations polymorphically.
//Execution Steps -> (No need for menu driven)
//1. When program executes it shoud ask for which type of employee calculation needs to be done.
//2. on the choice create object of that employee.
//3. call the respective methods of that class
//4. use of upcasting and downcasting is required
package com.employee.salary;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		
		System.out.println("0. Exit");
		System.out.println("1. Calculate earnings of SalariedEmployee");
		System.out.println("2. Calculate earnings of HourlyEmployee");
		System.out.println("3. Calculate earnings of CommissionEmployee");
		System.out.println("4. Calculate earnings of BasePlusCommissionEmployee");
		System.out.println("Enter your choice");
		choice=sc.nextInt();

		switch(choice) {
		case 0:{
			System.out.println("Thank you...!");
		}
			break;
		
		case 1:{
			Employee e1= new SalariedEmployee();
			e1.acceptData(sc);
			e1.displayEmployee();
			System.out.println("Earnings of SalariedEmployee: "+e1.earnings());		
		}
		break;

		case 2:{
			Employee e1= new HourlyEmployee();
			e1.acceptData(sc);
			e1.displayEmployee();
			System.out.println("Earnings of HourlyEmployee: "+e1.earnings());			
		}
		break;
		
		case 3:{
			Employee e1= new CommissionEmployee();
			e1.acceptData(sc);
			e1.displayEmployee();
			System.out.println("Earnings of CommissionEmployee: "+e1.earnings());			
		}
		break;
		
		case 4:{
			Employee e1= new BasePlusCommissionEmployee();
			e1.acceptData(sc);
			e1.displayEmployee();
			System.out.println("Earnings of BasePlusCommissionEmployee: "+e1.earnings());
			
			BasePlusCommissionEmployee e2=(BasePlusCommissionEmployee) e1;
			System.out.println("Earnings of BasePlusCommissionEmployee with rewards: "+e2.earningsPlusReward());
		}
		break;
		
		default:{
			System.out.println("Invalid choice...!");
		}
		break;
	}
	}
}
