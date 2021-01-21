package array;
import java.util.Scanner;
public class arrayex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int ar[]=new int[3];

	Scanner sc=new Scanner(System.in);
	for(int i=0;i<ar.length;i++)
	{
	System.out.println("enter the value");
    ar[i]=sc.nextInt();
	}
	for(int j:ar)
	{
		System.out.println(j);
	}
	}

}
