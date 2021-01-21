package com.sms.StudentDetails;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.sms.dao.impl.StudentImplementation;
import com.sms.Client.StudentClient;
import com.sms.bean.Student;

public class StudentDetails {
	Scanner sc=new Scanner(System.in);
	StudentImplementation si=new StudentImplementation();
	List<Student>addstudents=new ArrayList<>();
		public void StudentMenu(){
		
		while(true)
		{
        System.out.println("1)Addstudents");
		System.out.println("2)ViewAllstudents");
		System.out.println("3)Viewstudents");
		System.out.println("4)updatestudents");
		System.out.println("5)Deletestudents");
		System.out.println("6)Back");
		System.out.println("enter your choice");
	    int choiced=sc.nextInt();
		switch(choiced)
		{
		case 1:
			System.out.println("enter the student number");
			int sno=sc.nextInt();
			System.out.println("enter the student name");
			String sname=sc.next();
			System.out.println("enter the student address");
			String sadd=sc.next();
			Student s=new Student(sno,sname,sadd);
			addstudents.add(s);
			System.out.println(addstudents);
			System.out.println("Students record added successfully");
			si.insert(s);
			break;
		case 2:
			List<Student> viewstudents=si.viewAllstudents();
			System.out.println("``````````````````````````````````````````````````");
			System.out.println("SNO \t SNAME  \t SADD");
			

			System.out.println("``````````````````````````````````````````````````");

			for(Student sb : viewstudents)
			{
				if(sb!=null)
				
					System.out.println(sb.getSno()+" "+sb.getSname()+" "+sb.getSadd());

			//end of for loop
			}
			System.out.println("``````````````````````````````````````````````````");
			break;
		case 3:

			System.out.println("Enter Student Number :");
			int bno=sc.nextInt();
			Student st=si.viewstudents(bno);
			System.out.println("``````````````````````````````````````````````````");
			System.out.println("SNO \t SNAME  \t SADD");

			System.out.println("``````````````````````````````````````````````````");
			if(st!=null)
				System.out.println(st.getSno()+"\t"+st.getSname()+"\t"+st.getSadd());
			else
				System.out.println("Given Record Not Found");
			System.out.println("``````````````````````````````````````````````````");
			StudentMenu();
			break;
		case 4:
			System.out.println("Enter Student Number :");
			int uno=sc.nextInt();
			si.updatestudent(uno);
			StudentMenu();
			break;
		case 5:
			System.out.println("Enter Student Number :");
			int pno=sc.nextInt();
			si.deletestudent(pno);
			StudentMenu();
			break;
		case 6:
			StudentClient.main(null);
			break;
			default:
				System.out.println("Choose 1 to 6 between");

		}
		}// end of while loop
	}
}


