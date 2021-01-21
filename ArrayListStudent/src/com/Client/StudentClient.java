package com.Client;

import java.util.Scanner;

import com.details.StudentDetails;

public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
StudentDetails sd=new StudentDetails();
while(true)
{
	System.out.println("1)Student");
	System.out.println("2)Exit");
	System.out.println("enter your choice");
	int choice=sc.nextInt();
	switch(choice)
	{
	case 1:
		sd.StudentMenu();
		break;
	case 2:
		System.exit(0);
		System.out.println("thanks for using the application");
		break;
		default:
			System.out.println("choose in between 1 and 2");
			break;
	}
}
	}

}
