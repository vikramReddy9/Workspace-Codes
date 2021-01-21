package com.Implementation;
import com.bean.User;
import java.util.Scanner;
public class RegistrationImpl {
	User[]register=new User[2];
 Scanner sc=new Scanner(System.in);
public void register()
{
	for(int i=0;i<register.length;i++)
	{
	System.out.println("Enter the user identity number");
	int uid=sc.nextInt();
	System.out.println("Enter the name of the user");
    String name=sc.next();
	System.out.println("Enter the user email ");
    String uemail=sc.next();
    System.out.println("Enter the username you want ");
    String uname=sc.next();
	System.out.println("Enter the password you want to set");
    String upassword=sc.next();
    User u=new User(uid,name,uemail,uname,upassword);
    register[i]=u; 
    System.out.println("user record added sucessfully");
	}
}
public User [] login(String uemail,String upassword)
{ 
	int a=0;
	for(User k:register)
	{
		if(k!=null)
		{
			if(uemail.equals(k.getUemail())&&upassword.equals(k.getUpassword()))
			{
				a++;
				System.out.println("successfully logged in");
			}
		}
	}//end of for each
	if(a==0)
		System.out.println("Didnt found the given email or password");
	return register;
}
}
