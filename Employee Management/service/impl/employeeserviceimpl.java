package service.impl;
import java.util.Scanner;

import mypackage.Employee;
import mypackage.EmployeeAlreadyExists;
import mypackage.NoSuchRecordException;
import mypackage.service.EmployeeService;

public class employeeserviceimpl implements EmployeeService {
     Scanner sc=new Scanner(System.in);
     
    @Override
	public void deleteEmployee(Employee[] e) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id you want to delete");
		int del=sc.nextInt();
		del-=1;
		e[del].setId(0); e[del].setName(null);e[del].setOrganization(null);e[del].setSalary(0);	
	}
    @Override
	public void searchEmployee(Employee[] e) throws NoSuchRecordException{
			System.out.println("Enter id you want to search");
			int srch=sc.nextInt();
			srch-=1;
			if(e[srch].getId()!=0)
			System.out.println(e[srch].getId()+" "+e[srch].getName()+" "+e[srch].getOrganization()+" "+e[srch].getSalary());
			else
				throw new NoSuchRecordException("please enter valid employee id that existed");		
		
	}
    @Override
	public void updateEmployee(Employee[] e) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id of employee whom you want to update");
		int updt=sc.nextInt();
		updt-=1;
		System.out.println("Enter 1 to update name, 2 to update organization, 3 to update salary");
		int u=sc.nextInt();
		if(u==1) {
			System.out.println("Enter name");
			String name1 =sc.next();
			e[updt].setName(name1);
		}
		else if(u==2) {
			System.out.println("Enter Organization");
			String org1 =sc.next();
			e[updt].setOrganization(org1);
		}
		else if(u==3) {
			System.out.println("Enter Salary");
			int sal1 =sc.nextInt();
			e[updt].setSalary(sal1);
		}
		else
			System.out.println("Invalid");
	}
    @Override
	public void showEmployee(Employee[] e) {
		// TODO Auto-generated method stub
		for(int i=0;i<=e.length-1;i++) {
			if(e[i].getId()!=0)
			System.out.println(e[i].getId()+" "+e[i].getName()+" "+e[i].getOrganization()+" "+e[i].getSalary());
			}
		
	}
    @Override
	public void addEmployee(Employee[] e, int a) throws EmployeeAlreadyExists  {
			System.out.println("Add Employee");
			a++;
			System.out.println("Enter id");
			int id =sc.nextInt();
			//boolean check=false;
			for(int i=0;i<a;i++)
			{
				//Employee temp=e[i];
				if(id==e[i].getId())
					throw new EmployeeAlreadyExists("Employee already exists");
				else
					//check=true;
					e[a].setId(id);	
			}
			
			System.out.println("Enter name");
			String name =sc.next();
			e[a].setName(name);
			System.out.println("Enter organization");
			String org=sc.next();
			e[a].setOrganization(org);
			System.out.println("Enter salary");
			int sal=sc.nextInt();
			e[a].setSalary(sal);
	}
	

}
