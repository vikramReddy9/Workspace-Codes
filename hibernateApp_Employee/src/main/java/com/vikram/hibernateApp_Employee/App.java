package com.vikram.hibernateApp_Employee;

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
      /*  Employee emp=new Employee();
        emp.setEno(112);
        emp.setEname("sic");
        emp.setEadd("Banglore");*/    
        //Integer id=(Integer) ses.save(emp);//(return type Serializable)
     // System.out.println(emp.getEno()+"\t"+emp.getEname()+"\t"+emp.getEadd());
        //ses.persist(emp);//(void returntype)
        //System.out.println(emp);
      // System.out.println("generatedvalue :"+id);
        //ses.update(emp);(returntype void)
        //Employee em=(Employee)ses.merge(emp);//(return type Object)
        //System.out.println(em.getEno()+"\t"+em.getEname()+"\t"+em.getEadd());
       /* ses.saveOrUpdate(emp);
        tx.commit();*/
//        Employee empy=(Employee) ses.load(Employee.class,new Integer(107)); retturntype -- object
//        System.out.println(empy.getEno()+"\t"+empy.getEname()+"\t"+empy.getEadd());
//        Employee emp=new Employee();
//        ses.load(emp,new Integer(108)); return type --- void
//        System.out.println(emp.getEno()+"\t"+emp.getEname()+"\t"+emp.getEadd());
        Employee e=ses.get(Employee.class,new Integer(107));// return type -- object 
        System.out.println(e.getEno()+"\t"+e.getEname()+"\t"+e.getEadd());
       /* e.setEname("srujan");
        e.setEadd("Mogambiii");
        ses.update(e);
        System.out.println(e.getEno()+"\t"+e.getEname()+"\t"+e.getEadd());
        ses.flush();
        tx.commit();*/      
        try {
			Thread.sleep(15000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        ses.refresh(e);
        System.out.println(e.getEno()+"\t"+e.getEname()+"\t"+e.getEadd());
        tx.commit();
        ses.close();
        factory.close();
    }
}
