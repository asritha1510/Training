package queone;

import excep.InvalidOperatorException;

public interface service {
        
	void handleException(Activity a) throws InvalidOperatorException;
	String doOperation(Activity a);
}
