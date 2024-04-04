package com.car.pooling;

import java.util.Scanner;

public class Carpooling {
	double totalmiles;
	double costpergallon;
	double avgmiles;
	double parkingfees;
	double tolls;
	
	Scanner sc= new Scanner(System.in);

	public void acceptDetails(){
	System.out.println("Enter Total miles driven per day");
	totalmiles=sc.nextDouble();
	
	System.out.println("Cost per gallon of gasoline");
	costpergallon=sc.nextDouble();
	
	System.out.println("Average miles per gallon");
	avgmiles=sc.nextDouble();
	
	System.out.println("Parking fees per day");
	parkingfees=sc.nextDouble();
	
	System.out.println("Tolls per day");
	tolls=sc.nextDouble();	
}
	
	public void displayCost(){
		double Total= (costpergallon*totalmiles/avgmiles) + parkingfees + tolls;
		System.out.println("Total cost per day of driving to work: "+Total);		
	}
}
