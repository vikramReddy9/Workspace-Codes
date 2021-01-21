package com.vikram.HibernateApp_Bank;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Conjunction;
import org.hibernate.criterion.Order;

import javax.persistence.criteria.CriteriaQuery;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class CriteriaApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
        cfg.configure();
        SessionFactory factory=cfg.buildSessionFactory();
        Session ses=factory.openSession();
        Transaction tx=ses.beginTransaction();
        // select * from Bank
      /* Criteria c=ses.createCriteria(Bank.class);
       List<Bank>baccounts= c.list();
       for(Bank b:baccounts)
       {
    	   System.out.println(b.getAccno()+"\t"+b.getName()+"\t"+b.getBalance());
       }*/
   /* Criteria c=ses.createCriteria(Bank.class);
    c.add(Restrictions.and(Restrictions.like("name", "s%"),Restrictions.le("accno",101)));
    		  List<Bank>baccounts= c.list();
    for(Bank b:baccounts)
    {
 	   System.out.println(b.getAccno()+"\t"+b.getName()+"\t"+b.getBalance());	
	}*/
       /* Criteria c=ses.createCriteria(Bank.class);
        c.add(Restrictions.and(Restrictions.ge("accno",101)));
        		  List<Bank>baccounts= c.list();
        for(Bank b:baccounts)
        {
     	   System.out.println(b.getAccno()+"\t"+b.getName()+"\t"+b.getBalance());	
    	}*/
        /*Criteria c=ses.createCriteria(Bank.class);
        c.add(Restrictions.and(Restrictions.le("accno",104)));
        		  List<Bank>baccounts= c.list();
        for(Bank b:baccounts)
        {
     	   System.out.println(b.getAccno()+"\t"+b.getName()+"\t"+b.getBalance());	
    	}*/
       /* Criteria c=ses.createCriteria(Bank.class);
        c.add(Restrictions.and(Restrictions.eq("accno",101)));
        		  List<Bank>baccounts= c.list();
        for(Bank b:baccounts)
        {
     	   System.out.println(b.getAccno()+"\t"+b.getName()+"\t"+b.getBalance());	
    	}*/
      /* Criteria c=ses.createCriteria(Bank.class);
       Criterion c1=Restrictions.gt("accno",103);
       Criterion c3=Restrictions.eq("name","savings");
       Criterion c4=Restrictions.gt("balance",500);
       Criterion c5=Restrictions.le("balance",2500);
       Criterion c6=Restrictions.and(c1,c3);
       Criterion c7=Restrictions.and(c4,c5);
       Criterion c8=Restrictions.and(c6,c7);
       c.add(c8);*/
      /* Criteria c=ses.createCriteria(Bank.class);
       Criterion c1=Restrictions.gt("accno",103);
       Criterion c3=Restrictions.eq("name","savings");
       Criterion c4=Restrictions.gt("balance",500);
       Criterion c5=Restrictions.le("balance",2500);
       Conjunction con=Restrictions.conjunction();
       con.add(c1);
       con.add(c3);
       con.add(c4);
       con.add(c5);
       c.add(con);
       List<Bank>baccounts= c.list();
       for(Bank b:baccounts)
       {
    	   System.out.println(b.getAccno()+"\t"+b.getName()+"\t"+b.getBalance());	
   	}
*/       
     /*  Criteria c=ses.createCriteria(Bank.class);
       c.setProjection(Projections.projectionList()
    		   .add(Projections.property("accno"))
    		   .add(Projections.property("name")));
       List<Object[]> baccounts= c.list();
       for(Object[] b :baccounts)
       {
    	   System.out.println(b[0]+"\t"+b[1]);	
       }*/
       /* Criteria c=ses.createCriteria(Bank.class);
        c.setProjection(Projections.property("accno"));
        List<String> baccounts= c.list();
        for(String b :baccounts)
        {
     	   System.out.println(b);	
        }*/ 
       
       Criteria c=ses.createCriteria(Bank.class);
       c.addOrder(Order.desc("balance"));
       List<Bank>baccounts= c.list();
       for(Bank b:baccounts)
       {
    	   System.out.println(b.getAccno()+"\t"+b.getName()+"\t"+b.getBalance());
       }
	}
}
