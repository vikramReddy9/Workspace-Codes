package nonstaticvariable;

public class staticwithobject {
	static int sno=400;
	static void display()
	{
		System.out.println("static method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
staticwithobject d=new staticwithobject();
System.out.println("static method"  +d.sno);// static variables can access with reference variable(creating object)
staticwithobject d1=null;
System.out.println("static method"  +d1.sno);//static variable we can access even if we provide reference variable as null 
	}

}
