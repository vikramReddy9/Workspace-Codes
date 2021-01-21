
public class sharathdeposit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double deposit=500000;
int year=5;
float interest=6.8f;
System.out.println("deposit amount="+deposit);
double interestamount=(deposit*year*interest)/100;
System.out.println("Interest amount="+interestamount);
double totalamount=(deposit+interestamount);
System.out.println("total amount with interest="+totalamount);

	}

}
