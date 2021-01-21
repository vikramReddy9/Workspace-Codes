package nonstaticvariable;

public class shallowcloning {
int eno;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
shallowcloning c=new shallowcloning();
shallowcloning d=c;
System.out.println(c.eno+"\t"+d.eno);
d.eno=250;
System.out.println(c.eno+"\t"+d.eno);
	}
}
