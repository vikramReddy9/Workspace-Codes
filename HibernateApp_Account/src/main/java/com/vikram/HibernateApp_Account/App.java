package com.vikram.HibernateApp_Account;

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
        Account acc=new Account();
        //acc.setAccno(100);
        acc.setName("Savings");
        acc.setBalance(2500);
        ses.save(acc);
        tx.commit();
        ses.close();
        factory.close();
        
    }
}
