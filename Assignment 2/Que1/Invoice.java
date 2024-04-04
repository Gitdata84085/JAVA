//Q1. Create a class called Invoice that a hardware store might use to represent an invoice for an item
//sold at the store. An Invoice should include four pieces of information as fields—a part number
//(type String), a part description (type String), a quantity of the item being purchased (type int) and a
//price per item (double). Your class should have a constructor
//that initializes the four instance variables. Provide a set and a get method for each instance variable.
//calculates the invoice amount (i.e. multiplies the quantity by the price per item), then returns the
//amount as a double value.
//If the quantity is not positive, it should be set to 0.
//If the price per item is not positive, it should be set to 0.0.
//Write a test application named InvoiceTest that demonstrate class Invoice’s capabilities.
public class Invoice {
	String num;
	String desc;
	int quan;
	double price;
	
	public Invoice() {
		num="1";
		desc="Hammer";
		quan=1;
		price=100.00;
	}
	public Invoice(String num, String desc, int quan, double price) {
		this.num=num;
		this.desc=desc;
		this.quan=quan;
		this.price=price;		
	}
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getQuan() {
		return quan;
	}
	public void setQuan(int quan) {
		this.quan = quan;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double calculateInvoiceAmount(){
		if (quan<0)
			setQuan(0);
		if (price<0)
			setPrice(0.0);
		return (price*quan);
	}
	
	public void displayInvoice() {
		System.out.println("Part Number: "+num);
		System.out.println("Part Description: "+desc);
		System.out.println("Quantity: "+quan);
		System.out.println("Price: "+price);
	}
}
