package com.Dao.Impl;
import java.util.Scanner;
import com.bean.Student;
import java.util.ArrayList;
import java.util.List;
import com.Dao.StudentDao;
import com.details.StudentDetails;
public class StudentDaoImpl implements StudentDao {
	Scanner sc=new Scanner(System.in);
	static List<Student>addstudents=new ArrayList<Student>();
	@Override
	public void addstudents() {
		// TODO Auto-generated method stub
		StudentDetails sd=new StudentDetails();
		int k=1;
			while(k==1)
			{
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
			System.out.println("Do You Want Added One more Record 1)Yes 2)No");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
			s.setSno(sno);
			s.setSname(sname);
			s.setSadd(sadd);
			break;
			case 2:
				System.out.println("not want to add more students");
				sd.StudentMenu();
				break;
			case 3:
				System.exit(0);
				break;
			}	
			}
	}
	@Override
	public List<Student> viewAllstudents() {
		// TODO Auto-generated method stub
		return addstudents;
	}

	@Override
	public Student viewstudent(int sno) {
		for(Student s : addstudents)
		{
			if(s.getSno()==sno)
			{
				return s;
			}
	}
		return null;
	}

	@Override
	public void deletestudent(int sno) {
		int k=0;
		for(Student s:addstudents)
		{
			if(s.getSno()==sno)
			{
				System.out.println("do you want to update 1)sname2)sadd");
				int choice=sc.nextInt();
				switch(choice)
				{
				case 1:
					System.out.println("enter student name");
					String sname=sc.next();
					s.setSname(sname);
					break;
				case 2:
					System.out.println("enter student address");
					String sadd=sc.next();
					s.setSadd(sadd);
					break;
				case 3:
					System.exit(0);
					break;
					default:
						System.out.println("choose in between 1 and 2");
						break;
				}// end of switch
				k++;		
			}//end of if
		}//end of for loop
		if(k==0)
			System.out.println("Given Record Not Found");
	}

	@Override
	public void updatestudent(int sno) {
		// TODO Auto-generated method stub
		int k=0;
		for(Student s : addstudents)
		{
			if(s.getSno()==sno)
			{
				addstudents.remove(s);
				System.out.println("Student Record Deleted");
				k++;
				break;
			}
		}
		
		if(k==0)
			System.out.println("Given Record Not Found");

	}

}
