import java.util.Scanner;

public class equalsmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter username");
String uname=sc.next();
System.out.println("enter password");
String upass=sc.next();
if(uname.equals("vik")&&upass.equalsIgnoreCase("VIK"))
{
	System.out.println("validuser");
}
else
{
	System.out.println("invalid user");
}
	}

}
