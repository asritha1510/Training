package mypackage;

@SuppressWarnings("serial")
public class EmployeeAlreadyExists extends Exception {
	EmployeeAlreadyExists(String s)
	{
		super(s);
	}
}
