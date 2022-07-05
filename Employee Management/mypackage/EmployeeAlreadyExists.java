package mypackage;

@SuppressWarnings("serial")
public class EmployeeAlreadyExists extends Exception {
	public EmployeeAlreadyExists(String s)
	{
		super(s);
	}
}
