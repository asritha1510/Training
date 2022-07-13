package elibrary.excep;

@SuppressWarnings("serial")
public class BookAlreadyIssuedException extends Exception {
	public BookAlreadyIssuedException(String s)
	{
		super(s);
	}
}
