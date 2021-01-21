package nonstaticvariable;

public class staticvar {
static int sno=100;
static void display()
{
	System.out.println("static method");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("static method:"+sno);//we can directly access ststic varaibles without creating object
		
	}

}
