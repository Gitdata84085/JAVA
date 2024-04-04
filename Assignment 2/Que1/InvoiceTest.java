import java.util.Scanner;

public class InvoiceTest {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Part Number: ");
		String num=sc.nextLine();
		
		System.out.println("Enter Part Description: ");
		String desc=sc.nextLine();
		
		System.out.println("Enter Quantity: ");
		int quan=sc.nextInt();
		
		System.out.println("Enter Price: ");
		double price=sc.nextDouble();
		
		Invoice in= new Invoice(num,desc,quan,price);
		double amount= in.calculateInvoiceAmount();
		in.displayInvoice();
		System.out.println("Amount: "+amount);

	}

}
