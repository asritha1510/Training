package queone;

import java.util.Scanner;

import excep.InvalidOperatorException;
import serviceimpl.impl;

@SuppressWarnings("unused")
public class Main {
	
		public static void main(String args[])
		{
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			String str1;
			String str2;
			String operator;
			str1=sc.next();
			str2=sc.next(); 
			operator=sc.next();
			Activity a= new Activity(str1,str2,operator);
			impl imp=new impl();
			try {
				imp.handleException(a);
				System.out.println(imp.doOperation(a));
				}
				catch(Exception q)
				{
				System.out.println(q.getMessage());	
				} 
			    
			
			
		}
}
