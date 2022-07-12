package serviceimpl;
import excep.InvalidOperatorException;
import queone.Activity;
import queone.service;

public class impl implements service {

	@Override
	public void handleException(Activity a) throws NullPointerException, InvalidOperatorException{
	
		// TODO Auto-generated method stub
		if(!a.getOperator().equals("+") && !a.getOperator().equals("-"))
			throw new InvalidOperatorException("Invalid Operator");
	}

	@Override
	public String doOperation(Activity a) {
		// TODO Auto-generated method stub
		switch(a.getOperator()) {
		case "+":
			return 	a.getString1()+a.getString2();
		case "-":
			 if (a.getString1().length() > a.getString2().length()) 
			     return a.getString1().replace(a.getString2(),"");
			 else
			  return a.getString2().replace(a.getString1(), "");

		
	}
		return null;
	}
}

