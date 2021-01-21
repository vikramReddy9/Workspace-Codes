
import java.util.Scanner;

public class ass2 {
int totalbill;
int plates;
int price;
int bondatotalprice;
int dosatotalprice;
int idlytotalprice;
Scanner sc=new Scanner(System.in);
void bonda()
{
System.out.println("Enter the number of plates");
	int plates=sc.nextInt();
System.out.println("Enter the price for each bonda plate");
	int price=sc.nextInt();
	bondatotalprice=bondatotalprice+plates*price;
System.out.println("total bonda price="+ bondatotalprice);
}
void dosa()
{
System.out.println("Enter the number of plates");
	int plates=sc.nextInt();
System.out.println("Enter the price for each dosa plate");
	int price=sc.nextInt();
	dosatotalprice=dosatotalprice+plates*price;
System.out.println("total dosa price="+ dosatotalprice);
}
void idly()
{
System.out.println("Enter the number of plates");
	int plates=sc.nextInt();
System.out.println("Enter the price for each idly plate");
	int price=sc.nextInt();
	idlytotalprice=idlytotalprice+plates*price;
System.out.println("total idly price="+ idlytotalprice);
}
void totalbill()
{
	totalbill=bondatotalprice+dosatotalprice+idlytotalprice;
System.out.println("totalbill="+totalbill);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ass2 s=new ass2();
while(true)
{
	System.out.println("bonda");
	System.out.println("dosa");
	System.out.println("idly");
	System.out.println("bill");
	System.out.println("exit");
	System.out.println("enter your choice");
	int choice=sc.nextInt();
	switch(choice)
	{
	case 1:
		s.bonda();
		break;
	case 2:
		s.dosa();
		break;
	case 3:
		s.idly();
		break;
	case 4:
		s.totalbill();
		break;
	case 5:
		System.out.println("thanks");
		System.exit(0);
		break;
		default:
			System.out.println("enter the choice");
	}
}
	}

}
