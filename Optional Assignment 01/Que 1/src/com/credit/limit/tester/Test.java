//Q1. (Credit Limit Calculator)
//Develop a Java application that determines whether any of several department-store customers has
//exceeded the credit limit on a charge account.
//For each customer,the following facts are available:
//a) account number
//b) pending balance at the beginning of the month
//c) total of all items charged by the customer this month
//d) total of all credits applied to the customer’s account this month
//e) allowed credit limit.
//The program should input all these facts as integers, calculate the new balance (= beginning
//balance+ charges – credits), display the new balance and determine whether the new balance
//exceeds the customer’s credit limit. For those customers whose credit limit is exceeded, the
//program should display the message "Credit limit exceeded".
//For eg -
//Allowed Credit = 50000
//total items charged = 25000
//total all credit applied in this month = 10000
//pending balance at the begining of the month = 5000
//new balance for next month = 5000+25000-10000 => 20000 < Allowed Limit
package com.credit.limit.tester;

import com.credit.limit.Customer;

public class Test {

	public static void main(String[] args) {
		Customer c= new Customer();
		c.acceptData();
		c.calculateNewBalance();
		c.checkLimitExceededOrNot();

	}

}
