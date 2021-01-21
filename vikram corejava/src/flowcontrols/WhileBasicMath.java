package flowcontrols;

import java.util.Scanner;

public class WhileBasicMath {
int a;
int b;
int result;
Scanner sc=new Scanner(System.in);
	void add()
	{
		System.out.println("Enter the first number");
		a=sc.nextInt();
		System.out.println("enter the second number");
		b=sc.nextInt();
		result=a+b;
		System.out.println("addition of two numbers="+ result);
	}
	void sub()
	{
		System.out.println("Enter the first number");
		a=sc.nextInt();
		System.out.println("enter the second number");
		b=sc.nextInt();
		result=a-b;
		System.out.println("subtraction of two numbers="+ result);	
	}
	void mul()
	{
		System.out.println("Enter the first number");
		a=sc.nextInt();
		System.out.println("enter the second number");
		b=sc.nextInt();
		result=a*b;
		System.out.println("multiplication of two numbers="
				+ ""+ result);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
WhileBasicMath s=new WhileBasicMath();
while(true)
{
	System.out.println("add");
	System.out.println("sub");
	System.out.println("mul");
	System.out.println("add");
	System.out.println("exit");
	System.out.println("Enter your choice");
	int  choice=sc.nextInt();
switch(choice)
{
case 1:
	s.add();
	break;
case 2:
	s.sub();
	break;
case 3:
	s.mul();
	break;
case 4:
	System.out.println("thanks");
	System.exit(1);
	break;
	default:
		System.out.println("enter the choice");
}
	}

}
}
