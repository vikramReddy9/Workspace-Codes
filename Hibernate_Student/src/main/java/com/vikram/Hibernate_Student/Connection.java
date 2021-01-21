package com.vikram.Hibernate_Student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Connection {
	 Configuration cfg=new Configuration();
     //cfg.configure();
     SessionFactory factory=cfg.buildSessionFactory();
     Session ses=factory.openSession();
     Transaction tx=ses.beginTransaction();
}
