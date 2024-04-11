package com.sunbeam;

public class RevString {

	public static void main(String[] args) {
		String s="Adarsh";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--) {
			rev+=s.charAt(i);
		}
		
		System.out.println("Reverse String : "+rev);
	}

}
