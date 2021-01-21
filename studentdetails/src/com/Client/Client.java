

package com.Client;

import java.util.Scanner;
import student.bean.Student;
import student.implementation.StudentdaoImp;

	public class Client {
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StudentdaoImp dI=new StudentdaoImp();

		while(true){
			System.out.println("1)Add students");
			System.out.println("2)View all students");
			System.out.println("3)View student");
			System.out.println("4)Update stutednts");
			System.out.println("5)Delete students");
			System.out.println("6)Exit");
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				dI.addstudents();
				break;
			case 2:
				Student [] k=dI.viewAllstudents();
				System.out.println("=======================");
				System.out.println("SNO\tSNAME\tSADD");
				System.out.println("=======================");
				for(Student sb:k)//here instead of k we can give any name as it is collecting information from sb and storing in viewAllstudents
				{
					if(sb!=null)
				System.out.println(sb.getSno()+"\t"+sb.getSname()+"\t"+sb.getSadd());
				}
					
				break;
			case 3:
				System.out.println("Enter student number");
				int sno=sc.nextInt();
				Student stu=dI.viewstudent(sno);
				if(stu!=null)
				{
					System.out.println(stu.getSno()+"\t"+stu.getSname()+"\t"+stu.getSadd());
				}
					else
					{
					System.out.println("Given record is not found");	
					}
				break;
			case 4:
				System.out.println("Enter student number");
				int uno=sc.nextInt();
				dI.updatestudent(uno);
				break;
			case 5:
				System.out.println("Enter the sudent number");
				int kno=sc.nextInt();
				dI.deletestudent(kno);
				break;
			case 6:
			System.out.println("thanks for using ");
            System.exit(0);
            break;
            default:
            	System.out.println("choose in between 1 and 5");
            	break;
		}// End of while loop
	}
	}
}
