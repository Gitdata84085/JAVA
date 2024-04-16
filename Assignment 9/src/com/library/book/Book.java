package com.library.book;

import java.util.Objects;
import java.util.Scanner;

public class Book implements Comparable<Book> {
	private String isbn;
	category category;
	private double price;
	private String authorName;
	private int quantity;
	
	Scanner sc= new Scanner(System.in);
	
	public Book() {
		super();
	}

	public Book(String isbn, double price, String authorName, int quantity) {
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}
	
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public category getCategory() {
		return category;
	}

	public void setCategory(category category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void accept() {
		System.out.println("Enter isbn: ");
		isbn = sc.next();
		System.out.println("Enter price: ");
		price = sc.nextDouble();
		System.out.println("Enter Author Name: ");
		authorName= sc.next();
		System.out.println("Enter Quantity: ");
		quantity=sc.nextInt();
		category[] ref= category.values();
		for(category ele:ref)
			System.out.println(ele.ordinal()+". "+ele.name());
		int o;
		System.out.println("Enter category number :");
		o=sc.nextInt();
		this.category=ref[o];
	}

	
	
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", category=" + category + ", price=" + price + ", authorName=" + authorName
				+ ", quantity=" + quantity + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(isbn, other.isbn);
	}

	@Override
	public int compareTo(Book o) {
		return this.isbn.compareTo(o.isbn);
	}
	
	
	
	
	
}
