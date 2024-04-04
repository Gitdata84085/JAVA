package com.app.geometry;

import java.util.Scanner;

public class Point2D {
	int x;
	int y;
	
	Scanner sc= new Scanner(System.in);

	public Point2D(){
		x=1;
//		y=1;
	}
	
	public Point2D(int x,int y){
		this.x=x;
		this.y=y;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public String getDetails() {
		String details="("+ x +"," + y+")";
		return details;
	}
	
	public boolean isEqual(Point2D p1) {
		if(this.x==p1.getX() && this.y==p1.getY())
			return true;
		else 
			return false;}
	
	public void acceptPoints() {
		
		System.out.println("Enter points X & Y: ");
		x= sc.nextInt();
		y= sc.nextInt();
	}
		
	public double calculateDistance(Point2D p1){
		double a=this.x-p1.getX();
		double b=this.y-p1.getY();
		return Math.sqrt(Math.pow(2,a) + Math.pow(2,b));  //d=√((x2 – x1)² + (y2 – y1)²).
	}
	}

