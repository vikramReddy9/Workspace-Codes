package flowcontrols;
import java.util.Scanner;

public class ifladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the marks");
Scanner sc=new Scanner(System.in);
int marks=sc.nextInt();
if(marks>=90)
	System.out.println("Grade a");
else if(marks<90&&marks>=80)
	System.out.println("grade b");
	else if(marks<80&&marks>=70)
	System.out.println("grade c");
	else if(marks<50&&marks>35)// if you want to execute multiple statements we use if else if concept.
	System.out.println("grade d");
	else
		System.out.println("fail");
	}
}
