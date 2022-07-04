package mypackage;

@SuppressWarnings("serial")
public class NoSuchRecordException extends RuntimeException {
	NoSuchRecordException(String s)
	{
		super(s);
	}
}
