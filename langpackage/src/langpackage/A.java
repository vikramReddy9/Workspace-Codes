package langpackage;

public class A {
@Override// instead of getting hashcode if you write override method for toString() method you can give any written type you want.
public String toString() {
	// TODO Auto-generated method stub
	return "vikram";// in toString() method once you override it will not generate hashcode it will give what ever you specified in return type here vikram will be displayed
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
A a=new A();
System.out.println(a);//A@53e25b76 internally it calls toString() method due this we will get unique hashcode(A@53e25b76)
System.out.println(a.hashCode());// it will generate unique code (1407343478)
System.out.println(Integer.toHexString(a.hashCode()));// here Integer is a wrapper class with toHexString() method which has the capability to convert unique code into hexadecimal form(53e25b76) 
	}

}
