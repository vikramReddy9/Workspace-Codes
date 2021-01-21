package com.user.client;

import java.util.Scanner;

import com.dao.impl.UserDaoimple;
import com.user.bean.UserBean;

public class UserClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
UserDaoimple udi=new UserDaoimple();
while(true)
{
	System.out.println("1)Register");
	System.out.println("2)Login");
	System.out.println("3)Exit");
	System.out.println("Enter your choice");
	int choice =sc.nextInt();
	switch(choice)
	{
	case 1:
		System.out.println("enter first name:");
		String fname=sc.next();
		System.out.println("enter email:");
		String email=sc.next();
		System.out.println("enter username:");
		String uname=sc.next();
		System.out.println("enter password:");
		String upass=sc.next();
		System.out.println("enter mobileno:");
		long umo=sc.nextLong();
		//DTO--->DataTransferObject 
		UserBean ub =new UserBean(fname,email,uname,upass,umo);
		int count=udi.register(ub);
		if(count!=0)
		{
			System.out.println("User Registered successfully");
		}
		else
		{
			System.out.println("User not Registe unsuccessfully");
		}
		break;
	case 2:
		System.out.println("Enter username:");
		String unam=sc.next();
		System.out.println("Enter Password:");
		String upas=sc.next();
		boolean flag=udi.verifyuser(unam, upas);
		if(flag)
		{
			System.out.println("Login Succesfull");
		}
		else
		{
		System.out.println("Invalid Username/password");
		}
		break;
		
	case 3:
		System.out.println("thanks for using application");
		System.exit(0);
		break;
	default:
			System.out.println("enter in between 1 and 2");

	}
}
	}
}

