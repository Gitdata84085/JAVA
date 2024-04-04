//2. Accept 2 double values from User (using Scanner). Check data type. If arguments are not
//doubles, supply suitable error message & terminate.
//If numbers are double values, print its average.
//Hint : Check Scanner class for the methods
import java.util.Scanner;

public class Assign02
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		double d1,d2;
		System.out.println("Enter 1st number");
		if(sc.hasNextDouble()) 
		{
			d1=sc.nextDouble();
		System.out.println("Enter 2nd number");	
			if(sc.hasNextDouble())	
			{
				d2=sc.nextDouble();
				double avg;
				avg=(d1+d2)/2;
				System.out.println("Average: "+avg);
			}
			else 
			{
			System.out.println("Enter 2nd value correctly ");
		    
			}
		}
		else
		{
			System.out.println("Enter 1st value correctly ");
		}
	
	}  

	

}
