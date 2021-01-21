package com.vikram.ManttoManyuni;



import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.vikram.sessionutil.SessionUtility;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Session ses=SessionUtility.getSession();
    	Transaction tx=ses.beginTransaction();
    	Course c=new Course();
    	c.setCname("spring");
    	Course c1=new Course();
    	c1.setCname("Angular");
    	List<Course>clist=new ArrayList<Course>();
    	clist.add(c);
    	clist.add(c1);
    	Student s=new Student();
    	s.setSname("sic");
    	s.setClist(clist);
    	ses.save(s);
    	Student s1=new Student();
    	s.setSname("nic");
    	s.setClist(clist);
    	ses.save(s1);
    	tx.commit();
    	
    }
}
