package com.bean;

public class ItDept extends Salary {

	@Override
	public double caluculateSalary(String erole) {
		// TODO Auto-generated method stub
		if(erole.equals("developer"))
		return 85000.25;
		else
			if(erole.equals("testing"))
				return 65000.25;
			else
				if(erole.equals("devopsEng"))
					return 68000.85;
				else
					return 0.000;
	}

}
