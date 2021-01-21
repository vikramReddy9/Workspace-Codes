
public class Sampathpizza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double prize=399;
int order=2;
int discount=20;
System.out.println("cost for each pizza ="+prize);
double cost=order*prize;
System.out.println("Total cost for pizzas ="+cost);
double discountamount=(cost*20)/100;
System.out.println("total discount="+discountamount);
double totalamount=cost-discountamount;
System.out.println("prize with discount="+totalamount);


	}

}
