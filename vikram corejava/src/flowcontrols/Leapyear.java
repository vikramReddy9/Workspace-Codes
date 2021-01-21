package flowcontrols;

import java.util.Scanner;// Scanner can be imported by using this package.

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("the given year=");
int a=sc.nextInt();
if(a%4==0)
	System.out.println("given year is leap");
	else
		System.out.println("given number is not a leap");
}
}
