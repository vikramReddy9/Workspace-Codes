package flowcontrols;
import java.util.Scanner;

public class nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("enter age");
int age=sc.nextInt();
if(age>18)
{
	System.out.println("enter weight");
int weight=sc.nextInt();
if(weight>45)
System.out.println("he is eligible to donate");
else
	System.out.println("he is not eligible");
	}
else
	System.out.println("he is minor");
	}
}
