package langpackage;

public class CloneMethod implements Cloneable {
int i=100;
	public static void main(String[] args) throws CloneNotSupportedException {// it will give predefined exception i.e CloneNotSupportedException 
		// TODO Auto-generated method stub
CloneMethod c=new CloneMethod();
CloneMethod c1=(CloneMethod)c.clone();// syntax for creating an object for clone() method {deep cloning method}.
System.out.println(c.hashCode());
System.out.println(c1.hashCode());
System.out.println(c.i+"\t"+c1.i);

c.i=500;
System.out.println(c.i+"\t"+c1.i);// we can use this method as a backup purpose if you are chaning an object and you want information to be stored you can use this method.
	}
}
