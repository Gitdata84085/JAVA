package com.sunbeam;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string");
		String s=sc.next();
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--) {
			rev+=s.charAt(i);
		}
		
		if(s.equals(rev)) 
			System.out.println("String is Palindrome");
		else
			System.out.println("String is not Palindrome");		
	}

}
