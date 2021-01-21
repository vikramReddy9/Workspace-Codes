package com.Client;
import java.util.Scanner;
import adminImpl.AdminImpl;
import customerimpl.CustomerImp;
public class ClientDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		AdminImpl Ai=new AdminImpl();
		CustomerImp Ci=new CustomerImp();
while(true)
{
	System.out.println("1)Admin");
	System.out.println("2)Customer");
    System.out.println("3)Exit");
    System.out.println("Enter your choice");
    int choice=sc.nextInt();
    switch(choice)
    {
    case 1:
    	Ai.display();
    	break;
    case 2:
    	Ci.digital();
    	break;
    case 3:
    	System.out.println("thanks for using app");
		System.exit(0);
		break;
    default:
	System.out.println("default");
	break;
    }
}
}
}