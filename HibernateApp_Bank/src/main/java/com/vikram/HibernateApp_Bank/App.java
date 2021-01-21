package com.vikram.HibernateApp_Bank;



import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg=new Configuration();
        cfg.configure();
        SessionFactory factory=cfg.buildSessionFactory();
        Session ses=factory.openSession();
        Transaction tx=ses.beginTransaction();
        // selecting all columns and all records from table
       /* Query query=ses.createQuery("from Bank");
      List<Bank>baccounts=query.list();
      for(Bank b:baccounts)
      {
    	  System.out.println(b.getAccno()+"\t"+b.getName()+"\t"+b.getBalance());
      }
*/       
//        Query query=ses.createQuery("from Bank");
//        Iterator<Bank>baccounts=query.iterate();
//        while(baccounts.hasNext())
//        {
//        	Bank b=baccounts.next();
//        	System.out.println(b.getAccno()+"\t"+b.getName()+"\t"+b.getBalance());
//
//        }
        //select multiple columns/values
       /* Query query=ses.createQuery("select b.accno,b.name from Bank b");
        List<Object[]>baccounts=query.list();
        for(Object[] b:baccounts)
        {
        	System.out.println(b[0]+"\t"+b[1]);
        }*/      
        //select single column value
      /*  Query query=ses.createQuery("select b.accno from Bank b");
        List<Integer>baccounts=query.list();
        for(Integer b:baccounts)
        {
        System.out.println(b);
    }*/      
        //select multiple values
       /* Query query=ses.createQuery("select max(b.balance),min(b.balance) from Bank b");
        List<Object[]>baccounts=query.list();
        for(Object[] b:baccounts)
        {
        System.out.println("Max:="+ b[0]+"\t"+"Min:="+b[1]);
    }*/
        //single value 
        /*Query query=ses.createQuery("select avg(b.balance) from Bank b");
        List<Integer>baccounts=query.list();
        System.out.println("Average ="+baccounts.get(0));
*/
        //Aggegate functions
       /* Query query=ses.createQuery("select max(b.balance),min(b.balance),avg(b.balance),count(b) from Bank b");
        List<Object[]>baccounts=query.list();
        for(Object[] b:baccounts)
        {
        	System.out.println("max="+b[0]+"\t"+"min="+b[1]);
        	System.out.println("Average="+b[2]+"\t"+"count="+b[3]);

        }*/
        //group by single column
     /*Query query=ses.createQuery("select b.name,avg(b.balance) from Bank b GROUP BY b.name");
    List<Object[]>baccounts=query.list();
    for(Object[] b:baccounts)
    {
    	System.out.println("Name="+b[0]+"\t"+"Avg Balance="+b[1]);
    }  
*/
        //Group by multiple columns
        /*Query query=ses.createQuery("select b.name,b.balance,avg(b.balance),min(b.balance) from Bank b GROUP BY b.balance,b.name");
        List<Object[]>baccounts=query.list();
        for(Object[] b:baccounts)
        {
        	System.out.println("Name:  ="+b[0]+"\t"+" Balance:  ="+b[1]+"\t");
        	System.out.println("Avg Balance:  ="+b[2]+"\t"+"min Balance:  ="+b[3]); 
        }  
*/ 
        //Having Clause
       /* Query query=ses.createQuery("select b.name,avg(b.balance) from Bank b GROUP BY b.name Having b.name like '%savings%'");
        List<Object[]>baccounts=query.list();
        for(Object[] b:baccounts)
        {
        	System.out.println("Name="+b[0]+"\t"+"Avg Balance="+b[1]);
        }  */
   // order by clause with asc and desc
       /* Query query=ses.createQuery("select b.name,b.balance from Bank b ORDER BY b.balance desc");
        List<Object[]>baccounts=query.list();
        for(Object[] b:baccounts)
        {
        	System.out.println("Name="+b[0]+"\t"+"Balance="+b[1]);
        } */       
   // order by multiple columns
       /* Query query=ses.createQuery("from Bank b ORDER BY b.name asc,b.balance desc,b.accno");
        List<Bank>baccounts=query.list();
        for(Bank b:baccounts)
        {
        	System.out.println(b.getAccno()+"\t"+b.getName()+"\t"+b.getBalance());
        }    */
      //unique result for specific record
        /* Query query=ses.createQuery("from Bank b where b.accno=:no");
         query.setParameter("no", new Integer(104));
        Bank ba=(Bank)query.uniqueResult();
        if(ba!=null)
        {
        System.out.println(ba.getAccno()+"\t"+ba.getName()+"\t"+ba.getBalance());
        }
        else
        {
        	System.out.println("Record is not available");
        }
*/
        /*Query query=ses.createQuery("select b.name from Bank b where b.accno=:no");
        query.setParameter("no", new Integer(104));
       String name=(String)query.uniqueResult();
       System.out.println(name);
*/    
        /*Query query=ses.createQuery("select b.name,b.balance from Bank b where b.accno=:no");
        query.setParameter("no", new Integer(104));
       Object[] obj=(Object[])query.uniqueResult();
       System.out.println("name:="+obj[0]+"\t"+"balance:="+obj[1]);*/
    //update a query
       /* Query query=ses.createQuery("update Bank b set b.name='savings'");
       int count= query.executeUpdate();
      if(count!=0)  
      {
    	  System.out.println("rows are updated");
      }
      else
      {
    	  System.out.println("rows are not updated");
      }
        tx.commit();*/
        //delete using hql
       /* Query query=ses.createQuery("delete Bank b where b.accno=:no");
        query.setParameter("no", new Integer(105));
        int count= query.executeUpdate();
       if(count!=0)  
       {
     	  System.out.println("rows are deleted");
       }
       else
       {
     	  System.out.println("rows are not deleted");
       }
   tx.commit();*/
        //NamedQueries Hql---> 1)CreateQuery2)GetNamedQuery()-->using this we can call named hql queries
        	/*Query query=ses.getNamedQuery("Account.find.all");
        	List<Bank>baccounts=query.list();
        	for(Bank b:baccounts)
            {
          	  System.out.println(b.getAccno()+"\t"+b.getName()+"\t"+b.getBalance());
            }*/
    // there are two types of NativeSqlQueries
        //1)Scalar queries--->returns only one value as a result of the query execution.if we are using this we should use addScalar()
        //2)Entity queries--->returns one or more value as a result of the query execution. if we are using this we should use addEntity()
    }
}
