package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter x of 1st coordinate");
		int x1= sc.nextInt();
		
		System.out.println("Enter y of 1st coordinate");
		int y1= sc.nextInt();
		
		System.out.println("Enter x of 2nd coordinate");
		int x2= sc.nextInt();
		
		System.out.println("Enter y of 2nd coordinate");
		int y2= sc.nextInt();
		
		Point2D p1=new Point2D(x1,y1);
		Point2D p2=new Point2D(x2,y2);
		
		if(p1.isEqual(p2)) {
			System.out.println("Points are same");							
		}
		else {
				double result = p1.calculateDistance(p2);
				System.out.println("Distance between two points: "+result);
		}
		
	}

}
