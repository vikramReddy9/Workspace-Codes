package nonstaticvariable;

public class product {
int pid;
String pname;
void displayDetails()
{ 
	pid=100;
	pname="vikram";
	System.out.println(pid+"\t"+pname);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
product pro=new product();
System.out.println(pro.pid+"\t"+pro.pname);
pro.displayDetails();
System.out.println(pro.pid+"\t"+pro.pname);
	}
	
}
