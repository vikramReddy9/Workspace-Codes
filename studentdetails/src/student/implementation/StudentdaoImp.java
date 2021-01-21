package student.implementation;
import student.bean.Student;
import java.util.Scanner;
public class StudentdaoImp {
	Student []addstudents=new Student[3];
	Scanner sc=new Scanner(System.in);
public void addstudents() 
{ 
	for(int i=0;i<addstudents.length;i++)
	{
	System.out.println("Enter the student number");
	int sno=sc.nextInt();
	System.out.println("Enter the student name");
    String sname=sc.next();
	System.out.println("Enter the student address");
    String sadd=sc.next();
    Student sb=new Student(sno,sname,sadd);
    addstudents[i]=sb; 
    System.out.println("student record added sucessfully");
	}//end of for loop
}
public Student [] viewAllstudents()
{
	return addstudents;
}
public Student viewstudent(int sno)
{
	for(Student sb:addstudents)
	{
		if(sb.getSno()==sno)
			return sb;
	}
	
	return null;
}
public void updatestudent(int sno)
{
	int k=0;
	for(Student sb:addstudents)
	{
		if(sb!=null)
		{
		if(sb.getSno()==sno)
		{
			k++;
			System.out.println("do you want to update 1)sname 2)sadd");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter student name");
			String sname=sc.next();
			sb.setSname(sname) ;
			System.out.println("name is updated");
			break;
			case 2:
				System.out.println("Enter student address");
				String sadd=sc.next();
				sb.setSadd(sadd);
				System.out.println("Address is updated");
				break;
			}//end of switch
			
		}
		}
	}//end of for each
	if(k==0)
		System.out.println("Given record not found");
}
public void deletestudent(int sno)
{
	int k=0;
	int i=0;
	for(Student sb:addstudents)
	{
		if(sb.getSno()==sno)
		{
			addstudents[i]=null;
		System.out.println("Record deleted");
		i++;
		k++;
		}	
		else
		{
			i++;
		}
	}
	if (k==0 )
	System.out.println("record didnt found");
}
}
