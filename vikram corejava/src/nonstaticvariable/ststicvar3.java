package nonstaticvariable;

public class ststicvar3 {
static int count=55;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(count);
count=75;
System.out.println(count);
System.out.println(ststicvar3.count);
ststicvar3 d=new ststicvar3();
System.out.println(d.count);
d.count=95;
System.out.println(count);
System.out.println(ststicvar3.count);
System.out.println(d.count);
	}

}
// static allocates a memory once is sharable for all the objects can use in one single memory