package com.vikram.HibernateApp_Bank;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.type.StandardBasicTypes;

public class NativeSqlClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Configuration cfg=new Configuration();
	        cfg.configure();
	        SessionFactory factory=cfg.buildSessionFactory();
	        Session ses=factory.openSession();
	        Transaction tx=ses.beginTransaction();
	        /*SQLQuery squery=ses.creat+eSQLQuery("select * from Bank");
	        squery.addEntity("e",Bank.class);
	       List<Bank>baccounts= squery.list();
	       for(Bank b:baccounts)
	       {
	    	   System.out.println(b.getAccno()+"\t"+b.getName()+"\t"+b.getBalance());
	       }*/
	        // for specific column
	        /*SQLQuery squery=ses.createSQLQuery("select ACCOUNT_NUMBER,ACCOUNT_BALANCE from Bank");
	        squery.addScalar("ACCOUNT_NAME",StandardBasicTypes.STRING);
	        squery.addScalar("ACCOUNT_BALANCE",StandardBasicTypes.INTEGER);
	        List<Object[]>baccounts=squery.list();
	        for(Object[] b:baccounts)
	        {
	        	System.out.println(b[0]+"\t"+b[1]);
	        }*/
	        SQLQuery squery=ses.createSQLQuery("select max(b.ACCOUNT_BALANCE),min(b.ACCOUNT_BALANCE) from Bank b");
	        squery.addScalar("ACCOUNT_BALANCE",StandardBasicTypes.DOUBLE);
	        List<Object[]>baccounts=squery.list();
	        for(Object[] b:baccounts)
	        {
	        System.out.println("Max:="+ b[0]+"\t"+"Min:="+b[1]);
	    } 
	        
	}

}
