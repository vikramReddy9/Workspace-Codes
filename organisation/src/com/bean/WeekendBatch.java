package com.bean;

public class WeekendBatch extends Traningins {

	@Override
	double calculatefee(String course) {
		// TODO Auto-generated method stub
		if(course.equals("Java"))
			return 5000.08;
			else
		    if(course.equals(".net"))
		    return 5000;
			else
		   if(course.equals("python"))
			return 1000.50;
		   else
			   return 000;
	}

}
