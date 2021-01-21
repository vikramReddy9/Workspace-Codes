package pistahouse;

import java.util.Scanner;

public class IcecreamDetails {

	Scanner sc=new Scanner(System.in);
	int bsp=25;
	static int Tbsp;
	void bs()
	{
	System.out.println("Enter the number of cups");
		int cups=sc.nextInt();
		Tbsp=cups*bsp;
	System.out.println("total butterscotch price="+ Tbsp);
	}
	int vp=25;
	static int Tvp;
	void va()
	{
	System.out.println("Enter the number of cups");
		int cups=sc.nextInt();
		Tvp=cups*vp;
	System.out.println("total thums up price="+ Tvp);
	}
	public void icecreammenu()
	{
	while(true)	
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("1.Butterscotch");
		System.out.println("2.Vanilla");
		System.out.println("3.Back");
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			bs();
			icecreammenu();
			break;
		case 2:
			va();
			icecreammenu();
			break;
		case 3:
			PistaHouse.main(null);
			break;
			default:
				System.out.println("Enter between choices");
			
		}
	}
	}
}
