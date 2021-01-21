package com.bean;

public class HrDept extends Salary {

	@Override
	public double caluculateSalary(String erole) {
		// TODO Auto-generated method stub
		if(erole.equals("sr.hr manager"))
		return 75000.255;
		else
		if(erole.equals("jr.hr manager"))
        return 55000.258;
		else 
			return 0.000;
	}

}
