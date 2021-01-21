
package com.Client;
import java.util.Scanner;
import com.bean.User;
import com.Implementation.RegistrationImpl;
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
RegistrationImpl ri=new RegistrationImpl();
while(true)
{
	System.out.println("1)Register");
	System.out.println("2)Login");
	System.out.println("3)Exit");
	System.out.println("Enter your choice");
	
	int choice=sc.nextInt();
	switch(choice)
	{
	case 1:
			ri.register();
			break;
	case 2:
		System.out.println("enter the user email");
		String email=sc.next();
		System.out.println("enter the user password");
		String password=sc.next();
		ri.login(email,password);
		break;
	case 3:
		System.out.println("Thanks For Using This Application ");
        System.exit(0);
        break;
        default:
        	System.out.println("choose in between 1 and 2");
        	
        	break;
	}
	
}
	}

}
