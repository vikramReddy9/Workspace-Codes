package nonstaticvariable;

public class seperatememory {
int eno=200;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
seperatememory c=new seperatememory();
seperatememory b=new seperatememory();
System.out.println(c.eno);
System.out.println(b.eno);
b.eno=500;
c.eno=700;
System.out.println(c.eno);
System.out.println(b.eno);
System.out.println(c);
System.out.println(b);
	}

}
