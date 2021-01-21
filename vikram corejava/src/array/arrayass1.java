package array;
import java.util.Scanner;
public class arrayass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int ar[][]=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				ar[i][j]=sc.nextInt();
			}	
		}
		System.out.println("display elements");
		int sum=0;
		int s=0;
		int a[]=new int[ar.length];
		int b[]=new int[ar.length];
		for(int i=0;i<3;i++)
		{
			a[i]=ar[i][i];
			b[i]=ar[i][ar.length-i-1];
				sum+=ar[i][i];
				s+=ar[i][ar.length-i-1];	
		}
		for(int i:a)
		{
			System.out.print(i+"\t");
		}
			System.out.println(sum);
		for(int i:b)
		{
			System.out.print(i+"\t");
		}
			System.out.println(s);
	}
	}

