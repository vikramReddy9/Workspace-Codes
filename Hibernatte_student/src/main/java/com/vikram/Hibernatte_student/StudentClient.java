package com.vikram.Hibernatte_student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//step-1 prepare configuration object
		Configuration cfg=new Configuration();
		System.out.println(cfg.getProperty("hibernate.connection.driver_class"));
		System.out.println(cfg.getProperty("hibernate.connection.url"));
cfg.configure();
System.out.println(cfg.getProperty("hibernate.connection.driver_class"));
System.out.println(cfg.getProperty("hibernate.connection.url"));
//step 2: build a session factory
   SessionFactory factory=cfg.buildSessionFactory();
   //step:3 obtain session object
   Session ses=factory.openSession();
   Transaction tx=ses.beginTransaction();
   //step 4: persistence operations
   Student sb=new Student();
   sb.setSno(102);
   sb.setSname("nic");
   sb.setSadd("cad");
   ses.save(sb);
   tx.commit();
   System.out.println(ses.contains(sb));
   ses.evict(sb);
   System.out.println(ses.contains(sb));
   ses.close();
	}

}
