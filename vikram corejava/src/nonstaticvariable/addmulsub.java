package nonstaticvariable;

public class addmulsub {
	int a;
	int b;
	int res;
void add()
{
int a=500;
int b=200;
int res=a+b;
System.out.println(res);
}
void sub()
{
int a=500;
int b=200;
int res=a-b;
System.out.println(res);
}
void mul()
{
int a=5;
int b=2;
int res=a*b;
System.out.println(res);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
addmulsub s=new addmulsub();
s.add();
s.mul();
s.sub();
	}

}
