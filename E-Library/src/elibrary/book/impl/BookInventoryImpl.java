package elibrary.book.impl;
import java.util.ArrayList;
import java.util.Scanner;

import elibrary.excep.BookAlreadyIssuedException;
import elibrary.excep.ISBNAlreadyExistsException;
import elibrary.excep.ISBNDoesNotExistsException;
import elibrary.inventory.BookInventory;
import elibrary.model.Book;

public class BookInventoryImpl implements BookInventory{
	Scanner sc=new Scanner(System.in);
	@Override
	public void issuebook(ArrayList<Book> al) throws ISBNDoesNotExistsException, BookAlreadyIssuedException {
		// TODO Auto-generated method stub
		System.out.println("Enter isbn of book you wanted ");
		int id=sc.nextInt();
		boolean check=false;
		boolean alreadyissued=true;
		for(int i=0;i<al.size();i++)
		{
			if(id==al.get(i).getISBN())
			{
			check=true;	
			if(!al.get(i).issued)
				alreadyissued=false;
			}
			
		}
		if(check==false) {
			throw new ISBNDoesNotExistsException("ISBN does not exists");
		}
		else if(check==true && alreadyissued==true) {
			throw new BookAlreadyIssuedException("Book already issued");
		}
		else {
		System.out.println("Book Issued");
		for(int i=0;i<al.size();i++)
		{
			if(id==al.get(i).getISBN())
			{
			al.get(i).setIssued(true);
			}
			
		}
		}
		
		
	}
	public void displaybooks(ArrayList<Book> al) {
		for(int i=0;i<al.size();i++)
        {
            System.out.println("id:"+al.get(i).getISBN()+" "+al.get(i).getName());
            
        }
	}
	@Override
	public void addbook(ArrayList<Book> al) throws ISBNAlreadyExistsException {
		// TODO Auto-generated method stub
		 System.out.println("Enter ISBN :");
	        int id = sc.nextInt();
	        System.out.println("Enter Name :");
	        String name = sc.next();
		Book b=new Book(id,name,false);
		for(int i=0;i<al.size();i++)
        {
            if(id==al.get(i).getISBN()){
                throw new ISBNAlreadyExistsException("ISBN already exists");
            }
        }
        al.add(b);  
	}
	


	

	

}
