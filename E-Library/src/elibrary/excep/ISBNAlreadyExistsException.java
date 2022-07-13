package elibrary.excep;

@SuppressWarnings("serial")
public class ISBNAlreadyExistsException extends Exception{
	public ISBNAlreadyExistsException(String s)
	{
		super(s);
	}
}
