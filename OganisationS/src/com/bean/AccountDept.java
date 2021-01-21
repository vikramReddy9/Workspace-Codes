package com.bean;

public class AccountDept extends Salary {

	@Override
	public double  caluculateSalary(String erole){
		// TODO Auto-generated method stub
		if(erole.equals("bookkepper"))
		return 25000;
		else
			if(erole.equals("sr.accountant"))
	        return 58000;
		else
			if(erole.equals("jr.accountant"))
		return 38000.58;
			else
				return 0.000;
	}

}
