package pistahouse;
import java.util.Scanner;
public class PistaHouse {

	public static void main(String[] args) {
		

while(true){
	Scanner sc=new Scanner(System.in);

	System.out.println("1.Biryani");
	System.out.println("2.Drinks");
	System.out.println("3.Icecream");
	System.out.println("4.Bill");
	System.out.println("5.Exit");
	System.out.println("Enter your choice");
	int choice=sc.nextInt();
	switch(choice)
	{
	case 1:	
		BiryaniDetails B=new BiryaniDetails();
		B.biryanimenu();
		break;
	case 2:
		DrinksDetails D=new DrinksDetails();
		D.drinksmenu();
		break;
	case 3:
		IcecreamDetails I=new IcecreamDetails();
		I.icecreammenu();
		break;
	case 4:
		BillDetails T=new BillDetails();
		T.TotalBill();
		
		break;
	case 5:
		System.out.println("thanks for visiting");
		
		System.exit(0);
		break;
		default:
			System.out.println("choose between 1 and 5");
			break;
	}
}
	}

}
