package nonstaticvariable;

public class swapwotemp2 {
int a=200;
int b=500;
void display()
{
	a=b;
	b=a-300;
	System.out.println("after swapping: "+a+"\t"+b);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swapwotemp2 d=new swapwotemp2();
		d.display();
	}

}
