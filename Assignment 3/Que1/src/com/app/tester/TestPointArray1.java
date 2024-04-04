//Q1. Copy the Point2D class , along with the package from previous assignment.
//a) Create a class "TestPointArray1.java" in "tester" package for the following
//b) Accept , how many no of points to plot from user.
//c) Create suitable data structure
//Hint : Point2D[] points=new Point2D[sc.nextInt()];
//d) Prompt user for x & y co ordinates n store the data suitably
//Hint : for loop
//e) Supply Menu to user with various Options like following
//1. Display details of a specific point
//User i/p : index
//O/p : x & y co-ordinates should be displayed. or error message(eg : Invalid index , pls retry!!!!)
//2) Display x, y co-ordinates of all points
//Hint : for-each
//3) User i/p : 2 indices for the points , validate the indices
//Display distance between specified points (iff they are not located at the same position)
//eg : sop("Enter index of strt point n end point");
//validation : boundary condition (0<=index<length-1)
//isEqual -- false --compute distance --display it.
//4. Exit
package com.app.tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPointArray1 
{

	public static void main(String[] args) 
	{
		int n;
		int choice;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no. of points to plot");
		n = sc.nextInt();

		Point2D points[] = new Point2D[n];

		for (int i = 0; i < points.length; i++) 
		{
			points[i] = new Point2D();
			points[i].acceptPoints();
		}

		do {
			System.out.println("1. Display details of a specific point: ");
			System.out.println("2. Display x, y coordinates of all points");
			System.out.println("3. Display distance between specified points");
			System.out.println("4. Exit");
			System.out.println("Enter your choice");
			choice = sc.nextInt();

			switch (choice) 
			{
			case 1: 
			{
				System.out.println("Enter index");
				int j = sc.nextInt();
				if(j>=0 && j<points.length)
					System.out.println(points[j].getDetails());
				else
					System.out.println("Invalid index , pls retry!!!!");
			}
				break;
			
			case 2:
			{
				for(Point2D pref:points)
					System.out.println(pref.getDetails());
			}
				break;
				
			case 3:
			{
				System.out.println("Enter 2 indexes: ");
				int i1= sc.nextInt();
				int i2= sc.nextInt();
				if(!points[i1].isEqual(points[i2])) {
					System.out.println("Distance between specified points: "+points[i1].calculateDistance(points[i2]));
				}
				else
					System.out.println("Can't Display. Points are at same location.");
			}
			break;
			
			case 4:
			{
				System.out.println("Exit...!");
			}
			break;
			
			default:
			{
				System.out.println("Invalid choice...!");
			}
			break;				
		} 

	}while (choice != 4);
	}
}
