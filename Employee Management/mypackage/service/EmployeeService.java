package mypackage.service;

import mypackage.Employee;
import mypackage.EmployeeAlreadyExists;
import mypackage.NoSuchRecordException;

public interface EmployeeService {
 
	void  deleteEmployee(Employee e[]) ;
	
    void searchEmployee(Employee e[]) throws NoSuchRecordException ;
	
	void updateEmployee(Employee e[]) ;

	void showEmployee(Employee[] e) ;

	void addEmployee(Employee[] e, int a) throws EmployeeAlreadyExists ;

	
	
	
}

