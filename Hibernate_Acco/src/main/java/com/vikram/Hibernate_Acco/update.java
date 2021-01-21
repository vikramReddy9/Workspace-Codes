package com.vikram.Hibernate_Acco;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session ses=SessionUtility.getSession();
		   Transaction tx= ses.beginTransaction();
		  Acc ac=(Acc) ses.get(Acc.class,1);
		 //ac.getAtmcard().setCardpswrd("win12");
		Atm at=ac.getAtmcard();
		at.setCardpswrd("win125");
		  tx.commit();
	SessionUtility.CloseSession(ses);
	
	}

}
