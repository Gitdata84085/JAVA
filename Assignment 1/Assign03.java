//3. Display food menu to user. User will select items from menu along with the quantity. (eg 1. Dosa
//2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed prices to food items(hard code the prices)
//When user enters 'Generate Bill' option , display total bill & exit.
//(No need of any class, and no need to display the food deatils. Only display the total of orderd
//food)

import java.util.Scanner;

public class Assign03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice, quantity=1;
		double total=0;
	
	do
	{
		
		System.out.println("1. Dosa");
		System.out.println("2. Samosa");
		System.out.println("3. Idli");
		System.out.println("4. Pao Bhaji");
		System.out.println("5. Noodles");
		System.out.println("6. Medu Wada");
		System.out.println("7. Manchurian");
		System.out.println("8. Egg roll");
		System.out.println("9. Kachori");
		System.out.println("10. Generate bill");
		System.out.println("Enter the choice");
		choice=sc.nextInt();
		
		switch(choice) {
		case 1:
		{
			System.out.println("Enter quantity");
			quantity=sc.nextInt();
			total=total+(50*quantity);
			
		}
		break;
		case 2:
		{
			System.out.println("Enter quantity");
			quantity=sc.nextInt();
			total=total+(15*quantity);		
			
		}
		break;
		case 3:
		{
			System.out.println("Enter quantity");
			quantity=sc.nextInt();
			total=total+(20*quantity);		
			
		}
		break;
		case 4:
		{
			System.out.println("Enter quantity");
			quantity=sc.nextInt();
			total=total+(40*quantity);		
			//break;
		}
		break;
		case 5:
		{
			System.out.println("Enter quantity");
			quantity=sc.nextInt();
			total=total+(90*quantity);		
			//break;
		}
		break;
		case 6:
		{
			System.out.println("Enter quantity");
			quantity=sc.nextInt();
			total=total+(25*quantity);		
			//break;
		}
		break;
		case 7:
		{
			System.out.println("Enter quantity");
			quantity=sc.nextInt();
			total=total+(75*quantity);		
			//break;
		}
		break;
		case 8:
		{
			System.out.println("Enter quantity");
			quantity=sc.nextInt();
			total=total+(60*quantity);		
			//break;
		}
		break;
		case 9:
		{
			System.out.println("Enter quantity");
			quantity=sc.nextInt();
			total=total+(20*quantity);		
			///break;
		}
		break;
		case 10:
		{
			System.out.println("Generate bill");
			System.out.println("Total: "+total);		
			//break;
		}
		break;
		}}while(choice!=10);
			
		}

}
