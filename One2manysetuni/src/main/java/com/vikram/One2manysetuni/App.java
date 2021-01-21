package com.vikram.One2manysetuni;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.vikram.entity.Department;
import com.vikram.entity.Employee;
import com.vikram.sessionutil.SessionUtility;

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
        Employee emp=new Employee();
        emp.setEname("pik");
        emp.setSalary(82500);
        Employee emp1=new Employee();
        emp1.setEname("dik");
        emp1.setSalary(22500);
        Employee emp2=new Employee();
        emp2.setEname("aik");
        emp2.setSalary(62500)	;
        Set<Employee>eSet=new HashSet<Employee>();
        eSet.add(emp);
        eSet.add(emp1);
        eSet.add(emp2);
        Department d=new Department();
        d.setDname("IT");
        d.setLocation("aus");
        d.setEmployeeset(eSet);
        ses.save(d);
        tx.commit();
        SessionUtility.CloseSession(ses);
        
    }
}
