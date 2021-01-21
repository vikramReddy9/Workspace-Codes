package nonstaticvariable;

public class account {
int accNo;
String accName;
void display()
{
	accNo=100;
	accName="savings";
	System.out.println(accNo+"\t"+accName);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		account acc=new account();
		System.out.println(acc.accNo+"\t"+acc.accName);
acc.display();
System.out.println(acc.accNo+"\t"+acc.accName);
acc.accNo=500;
System.out.println(acc.accNo+"\t"+acc.accName);
	}

}
