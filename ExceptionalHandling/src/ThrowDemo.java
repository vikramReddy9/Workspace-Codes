import java.util.Scanner;
class invalidage extends RuntimeException
{
	invalidage(String s)
	{
	super(s);
	}
}
public class ThrowDemo {
	Scanner sc=new Scanner(System.in);
	void display() throws invalidage
	{
		System.out.println("enter the age");
		int age=sc.nextInt();
		if(age>18)
		{
			System.out.println("he is major");
		}
		else
		{
			throw new invalidage("he is minor");
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowDemo td=new ThrowDemo();
		try {
			td.display();
		} catch (invalidage e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
