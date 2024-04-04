//Q2. Create an application that calculates your daily driving cost, so that you can estimate how much
//money could be saved by car pooling, which also has other advantages such as reducing carbon
//emissions and reducing traffic congestion. The application should input the following information
//and display the user’s cost per day of driving to work:
//a) Total miles driven per day.
//b) Cost per gallon of gasoline.
//c) Average miles per gallon.
//d) Parking fees per day.
//e) Tolls per day.
package com.car.tester;

import com.car.pooling.Carpooling;

public class Testcar {

	public static void main(String[] args) {
		Carpooling c= new Carpooling();
		c.acceptDetails();
		c.displayCost();
	}

}
