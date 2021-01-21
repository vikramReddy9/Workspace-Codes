package com.details;
import com.bean.Student;
import java.util.List;
import java.util.Scanner;
import com.Client.StudentClient;
import com.Dao.Impl.StudentDaoImpl;
import com.bean.Student;

public class StudentDetails {
Scanner sc=new Scanner(System.in);
StudentDaoImpl sdi=new StudentDaoImpl();
Student s=new Student();
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
    int choice=sc.nextInt();
	switch(choice)
	{
	case 1:
		sdi.addstudents();
		break;
	case 2:
		List<Student> viewstudents=sdi.viewAllstudents();
		System.out.println("``````````````````````````````````````````````````");
		System.out.println("SNO \t SNAME  \t SADD");

		System.out.println("``````````````````````````````````````````````````");

		for(Student s : viewstudents)
		{
		//	if(s!=null)
			
				System.out.println(s.getSno()+"\t"+s.getSname()+"\t"+s.getSadd());

		//end of for loop
		}
		System.out.println("``````````````````````````````````````````````````");
		break;
	case 3:

		System.out.println("Enter Student Number :");
		int sno=sc.nextInt();
		Student st=sdi.viewstudent(sno);
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
		sdi.updatestudent(uno);
		StudentMenu();
		break;
	case 5:
		System.out.println("Enter Student Number :");
		int pno=sc.nextInt();
		sdi.deletestudent(pno);
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

