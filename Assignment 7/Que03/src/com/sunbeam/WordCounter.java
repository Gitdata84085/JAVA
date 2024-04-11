package com.sunbeam;

import java.util.Scanner;

public class WordCounter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A string ");
		String s=sc.nextLine();
		
		s.trim();
		int  arr=s.split(" ").length;
		System.out.println(arr);	
		
		sc.close();
	}

}