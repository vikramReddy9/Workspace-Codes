package array;

import java.util.Scanner;

public class ex {

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
		for(int i=0;i<3;i++)
		{
				sum+=ar[i][i];
				s+=ar[i][ar.length-i-1];
			
			System.out.print(ar[i][i]+" ");	
			}
		System.out.println(sum);
		System.out.println(s);
	}
}