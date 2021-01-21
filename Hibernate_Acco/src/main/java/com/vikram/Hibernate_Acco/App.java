package com.vikram.Hibernate_Acco;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Session ses=SessionUtility.getSession();
    	ses.beginTransaction();
    	//Transaction tx=ses.beginTransaction();
    	Atm at=new Atm();
    	at.setCardpswrd("si123");
    	at.setCardtype("debit");
    	Acc a = new Acc();
    	a.setName("sikram");
    	a.setBalance(22500);
    	a.setAtmcard(at);
    	ses.save(a);
    	ses.save(at);
    	ses.getTransaction().commit();
    	//tx.commit(); 
    	SessionUtility.CloseSession(ses);
    }
}
