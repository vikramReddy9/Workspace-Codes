package com.bean;

public class Fasttrackbatch extends Traningins {

	@Override
	double calculatefee(String course) {
		// TODO Auto-generated method stub
		if(course.equals("Java"))
		return 20000.08;
		else
	    if(course.equals(".net"))
	    return 10000;
		else
		return 2000.50;	
	}

}
