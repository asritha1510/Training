package mypackage;
import java.util.*;
import mypackage.service.EmployeeService;
import service.impl.employeeserviceimpl;

public class Main {
	public static void main(String args[]) {
		DisplayMessage.displayMsg("welcome to Employee Management System");
		Employee e[]=new Employee[5];
		 e[0]=new Employee();
		 e[1]=new Employee();
		 e[2]=new Employee();
		 e[3]=new Employee();
		 e[4]=new Employee();

		Scanner sc=new Scanner(System.in);
		int ch;
		int a=0;
		boolean exit=true;
	    employeeserviceimpl esi=new employeeserviceimpl();
		e[0]=new Employee();
		e[0].setId(1);
		e[0].setName("Asri");
		e[0].setOrganization("FTD");
		e[0].setSalary(10000);
		while(exit)
		{
			System.out.println("Enter your choice \n1.Add 2. Show 3. Update 4. Delete 5.Search 6. Exit");	
			ch=sc.nextInt();
			try {
				switch(ch) {
				case 1:
					try {
					esi.addEmployee(e, a);
					}
					catch(EmployeeAlreadyExists q)
					{
					System.out.println(q.getMessage());	
					} 
				    break;
				case 2: 
					esi.showEmployee(e);					
					break;
				case 3:
					esi.updateEmployee(e);
					break;
					
				case 4:
					esi.deleteEmployee(e);
					break;
				case 5:
					try {
						esi.searchEmployee(e);			
					}
					catch(NoSuchRecordException w)
					{
						System.out.println(w.getMessage());
					}
					break;			
				case 6:
					exit=false;	
				}
			} catch (Exception ee) {
				// TODO Auto-generated catch block
				ee.printStackTrace();
			}
		}
	}

}