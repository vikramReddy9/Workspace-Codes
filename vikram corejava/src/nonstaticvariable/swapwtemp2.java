package nonstaticvariable;

public class swapwtemp2 {
int a=200;
int b=300;
int temp=400;
void display()
{
	temp=a;
	a=b;
	b=temp;
	System.out.println("after swapping:" +a+"\t"+b);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
swapwtemp2 d=new swapwtemp2();
d.display();
System.out.println("after swapping:" +d.a+"\t"+d.b);
	}

}
