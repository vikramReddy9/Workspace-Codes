package com.vikram.Hibernate_Acco;



import org.hibernate.Session;
import org.hibernate.Transaction;

public class Retrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Session ses=SessionUtility.getSession();
   Transaction tx= ses.beginTransaction();
  Acc ac=(Acc) ses.get(Acc.class,1);
  System.out.println(ac.getAccno()+"\t"+ac.getName()+"\t"+ac.getBalance()+"\t"+ac.getAtmcard().getCno()+"\t"+ac.getAtmcard().getCardpswrd()+"\t"+ac.getAtmcard().getCardtype());
    tx.commit();
    SessionUtility.CloseSession(ses);
	}

}
