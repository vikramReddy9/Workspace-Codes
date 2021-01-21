package flowcontrols;

import java.util.Scanner;

public class returntext {
	void mul(int fno,int sno)
	{
		int res=fno*sno;
		System.out.println("res of two numbers="+res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		returntext d=new returntext();		
Scanner sc=new Scanner(System.in);
System.out.println("enter first number");
int fno=sc.nextInt();
System.out.println("enter second number");
int sno=sc.nextInt();
d.mul(fno,sno);// syntax:(ObjectReference.void(integer x,integer y))
	}

}
