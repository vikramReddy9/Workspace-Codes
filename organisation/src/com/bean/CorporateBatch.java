package com.bean;

public class CorporateBatch extends Traningins {

	@Override
	double calculatefee(String course) {
		// TODO Auto-generated method stub
		if(course.equals("Java"))
			return 40000.08;
			else
		    if(course.equals(".net"))
		    return 20000;
			else
			return 4000.50;
}
}