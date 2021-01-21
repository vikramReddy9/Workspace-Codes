package pistahouse;

import java.util.Scanner;

public class DrinksDetails {
	Scanner sc=new Scanner(System.in);
	int thumsup=25;
	static int Tutp;
	void thumsup()
	{
	System.out.println("Enter the number of bottles");
		int bottles=sc.nextInt();
		Tutp=Tutp+bottles*thumsup;
	System.out.println("total thums up price="+ Tutp);
	}
	int spritep=25;
	static int stp;
	void sprite()
	{
	System.out.println("Enter the number of bottles");
		int bottles=sc.nextInt();
		stp=stp+bottles*spritep;
	System.out.println("total sprite price="+ stp);
	}
	int teap=10;
	static int tteap;
	void tea()
	{
	System.out.println("Enter the number of cups");
		int cups=sc.nextInt();
		tteap=tteap+cups*teap;
	System.out.println("total tea price="+ stp);
	}
	int coffeep=15;
	static int tcoffeep;
	void coffee()
	{
	System.out.println("Enter the number of cups");
		int cups=sc.nextInt();
		tcoffeep=tcoffeep+cups*coffeep;
	System.out.println("total coffee up price="+ stp);
	}
	public void drinksmenu()
	{
		while(true)
	{
			Scanner sc=new Scanner(System.in);

		System.out.println("1.thumpsup");
		System.out.println("2.sprite");
		System.out.println("3.tea");
		System.out.println("4.coffee");
		System.out.println("5.Back");
		System.out.println("enter your choice");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
		    thumsup();
	     	drinksmenu();
	    	break;
		case 2:
			sprite();
			drinksmenu();
			break;
		case 3:
			tea();
			drinksmenu();
			break;
		case 4:
			coffee();
			drinksmenu();
			break;
		case 5:
			PistaHouse.main(null);
			break;
			default:
				System.out.println("Enter choice in between case 1 and 4");
			break;
			}
	}
	}
}
