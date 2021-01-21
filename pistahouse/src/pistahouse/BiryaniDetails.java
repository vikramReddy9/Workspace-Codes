package pistahouse;

import java.util.Scanner;

public class BiryaniDetails {
	int cbp=150;
    static int Tcbp;
	int mbp=200;
	static int Tmbp;
	int vbp=70;
	static int Tvbp;
	Scanner sc=new Scanner(System.in);
public	void cb()
	{
	System.out.println("Enter the number of plates");
		int plates=sc.nextInt();
		  Tcbp=Tcbp+plates*cbp;
	System.out.println("total chickenbiryani price="+ Tcbp);
	}

public	void mb()
	{
	System.out.println("Enter the number of plates");
		int plates=sc.nextInt();
		Tmbp=Tmbp+plates*mbp;
	System.out.println("total muttonbiryani price="+ Tmbp);
	}

public void vb()
	{
	System.out.println("Enter the number of plates");
		int plates=sc.nextInt();
		Tvbp=Tvbp+plates*vbp;
	System.out.println("total veganbiryani price="+ Tvbp);
	}
public void biryanimenu()
{
while(true)
{	
	Scanner sc=new Scanner(System.in);

	System.out.println("1.CB");
	System.out.println("2.MB");
	System.out.println("3.VB");
	System.out.println("4.Back");
	System.out.println("Enter your choice");
	int choice=sc.nextInt();
	switch(choice)
	{
	case 1:
		cb();
		biryanimenu();
		break;
	case 2:
		mb();
		biryanimenu();
		break;
	case 3:
		vb();
		biryanimenu();
		break;
	case 4:
		PistaHouse.main(null);
		break;
	default:
			System.out.println("Enter choice between");
}
  }
}
  }

