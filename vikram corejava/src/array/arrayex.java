package array;

public class arrayex {

	public static void main(String[] args) {
		

	int ar[]=new int [3];
	System.out.println(ar[0]);
	System.out.println(ar[1]);
	System.out.println(ar[2]);// if// if we print more than index it will give "array index out of bound exception"
ar[0]=100;
ar[1]=200;
ar[2]=300;
System.out.println(ar[0]);//if we assign the values it will print the values here the output will be 100 200 300
System.out.println(ar[1]);
System.out.println(ar[2]);

}
}

