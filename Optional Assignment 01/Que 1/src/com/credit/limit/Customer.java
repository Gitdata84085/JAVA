package com.credit.limit;

import java.util.Scanner;

public class Customer {
	int accno;
	int pendingbalance;
	int totalitemscharged;
	int totalcredits;
	int creditlimit;
	int newbalance;
	
	Scanner sc= new Scanner(System.in);
	
	public void acceptData(){
		System.out.println("Enter account number: ");
		accno=sc.nextInt();
		
		System.out.println("Pending balance at the beginning of the month: ");
		pendingbalance=sc.nextInt();
		
		System.out.println("Total of all items charged by the customer this month: ");
		totalitemscharged=sc.nextInt();
		
		System.out.println("Total of all credits applied to the customer’s account this month: ");
		totalcredits=sc.nextInt();
		
		System.out.println("Allowed credit limit: ");
		creditlimit=sc.nextInt();
	}
	
	public void calculateNewBalance() {
		newbalance=pendingbalance+totalitemscharged-totalcredits;
		
	}
	
	public void displayNewBalance() {
		System.out.println("New Balance: "+ newbalance);
	}
	
	public void checkLimitExceededOrNot() {
		if(newbalance<creditlimit) {
			displayNewBalance();
		}
		else {
			System.out.println("Credit limit exceeded");
		}
	}
}
