package mypackage;

@SuppressWarnings("serial")
public class NoSuchRecordException extends RuntimeException {
	public NoSuchRecordException(String s)
	{
		super(s);
	}
}
