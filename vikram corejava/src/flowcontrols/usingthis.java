package flowcontrols;

public class usingthis {
int i=5000;
int j=6000;
 int k=55;
 void funA(int j)
 {
	 System.out.println("before using this keyword:");
	 System.out.println(i+"\t"+j+"\t"+k);//here without keyword it takes local variable 
	 System.out.println("after using this keyword:");
	 System.out.println(this.i+"\t"+this.j+"\t"+this.k);//"this" keyword is used to differentiate local and non static variables.
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		usingthis u=new usingthis();
		u.funA(258);//with this keyword it uses non static variable.
}
}