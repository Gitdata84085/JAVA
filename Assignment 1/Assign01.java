//Q1. Accept a integer number and when the program is executed print the binary, octal and
//hexadecimal equivalent of the given number.
//Sample Output:
//java Test
//Enter Number : 20
//Given Number :20
//Binary equivalent :10100
//Octal equivalent :24
//Hexadecimal equivalent :14
//Hint : Use Wrapper Class (toBinaryString() , toOctalString(), toHexString())
import java.util.Scanner;

public class Assign01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		
		String s1=Integer.toBinaryString(num);
		System.out.println("Binary Equivalent: "+s1);
		
		String s2=Integer.toOctalString(num);
		System.out.println("Octal Equivalent: "+s2);
		
		String s3=Integer.toHexString(num);
		System.out.println("Octal Equivalent: "+s3);
		
	}

}
