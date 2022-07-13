package elibrary.controller;

import java.util.ArrayList;
import java.util.Scanner;

import elibrary.book.impl.BookInventoryImpl;
import elibrary.excep.ISBNAlreadyExistsException;
import elibrary.model.Book;

public class BookInventoryController {
	public static void main(String args[]) {
		BookInventoryImpl bimpl=new BookInventoryImpl();
		ArrayList<Book> al=new ArrayList<Book>();
		Book b1=new Book(1001,"Maths",false);
		Book b2=new Book(1002,"Physics",false);
		al.add(b1);
		al.add(b2);
	
		Scanner sc=new Scanner(System.in);
			
		int ch;
		boolean exit=true;
		while(exit)
		{
			System.out.println("Enter your choice \n1.Add 2.Display Books 3.Issue Book 4.Exit");	
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				try {
					bimpl.addbook(al);
				} catch (ISBNAlreadyExistsException e1) {
					System.out.println(e1.getMessage());
				}
				break;
			case 2:
				bimpl.displaybooks(al);
				
				break;
			case 3:
				try {
					bimpl.issuebook(al);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				exit=false;
				
			}
		
		}
		sc.close();
	}
}
