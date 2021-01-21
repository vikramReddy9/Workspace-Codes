package nonstaticvariable;

public class staticvar2 {
	static int sno=400;
	static void display()
	{
		System.out.println("static method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("static method:" +staticvar2.sno);//using class name we can access static variable
	}

}
