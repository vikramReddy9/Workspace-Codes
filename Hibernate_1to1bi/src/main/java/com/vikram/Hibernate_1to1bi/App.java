package com.vikram.Hibernate_1to1bi;

import org.hibernate.Session;
import org.hibernate.Transaction;

import Hibdernate_SessionUtil.SessionUtility;
import Hibernate.Acc;
import Hibernate.Atm;

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
       Atm at=new Atm();
       at.setCardpswrd("vikramy1");
       at.setCardtype("debit");
       
       Acc ac=new Acc();
       ac.setBalance(2500);
       ac.setName("vikram");
       ac.setAtmcard(at);
       at.setAccount(ac);
       ses.save(at);
       tx.commit();
       SessionUtility.CloseSession(ses);
       }
}
