package com.library.book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		Set<Book> bookList = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		Book b;
		int choice;
		class BookCategory implements Comparator<Book> {
			@Override
			public int compare(Book o1, Book o2) {
				return o2.getCategory().compareTo(o1.getCategory());
			}
		}
		class BookAuthor implements Comparator<Book> {
			@Override
			public int compare(Book o1, Book o2) {
				return o1.getAuthorName().compareTo(o2.getAuthorName());
			}
		}

		do {
			System.out.println("0. Exit...!");
			System.out.println("1. Accept book details and add in collection");
			System.out.println("2. Display all books from collection");
			System.out.println("3. Sort the book details as per category and display it");
			System.out.println("4. Sort the book details as per author and display it");
			System.out.println("5. Find book by id");
			System.out.println("Enter your choice");
			choice = sc.nextInt();

			switch (choice) {
			case 0:
				System.out.println("Thank you...!");
				break;

			case 1: {
				b = new Book();
				b.accept();
				bookList.add(b);
			}
				break;

			case 2:
				for (Book book : bookList) {
					System.out.println(book);
				}
				break;

			case 3: {
				ArrayList<Book> b1 = new ArrayList<>();
				b1.addAll(bookList);
				Comparator<Book> BookCategoryComparator = new BookCategory();
				Collections.sort(b1, BookCategoryComparator);
				for (Book ele : b1)
					System.out.println(ele);
			}
				break;

			case 4: {
				ArrayList<Book> b1 = new ArrayList<>();
				b1.addAll(bookList);
				Comparator<Book> BookAuthorComparator = new BookAuthor();
				Collections.sort(b1, BookAuthorComparator);
				for (Book ele : b1)
					System.out.println(ele);
			}

				break;

			case 5: {
				ArrayList<Book> b1 = new ArrayList<>();
				b1.addAll(bookList);
				String s;
				System.out.println("Enter book id to find");
				s = sc.next();
				b = new Book();
				b.setIsbn(s);
				if (b1.contains(b))
					System.out.println("Book exists");
				else
					System.out.println("Book not found");
			}

				break;

			default:
				System.out.println("Invalid choice...!");
				break;
			}

		} while (choice != 0);
	}

}
