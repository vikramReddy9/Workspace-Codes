package nonstaticvariable;

public class employee {
int eno;
String ename;
void display()
{
	
	int eno=100;
	String ename="vikram";
	System.out.println(eno+"\t"+ename);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
employee emp=new employee();
System.out.println(emp.eno+"\t"+emp.ename);
emp.display();
System.out.println(emp.eno+"\t"+emp.ename);
	}
}
