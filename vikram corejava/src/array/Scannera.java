package array;

import java.util.Scanner;

public class Scannera {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
int ar[][]=new int[3][3];
for(int i=0;i<ar.length;i++)
{
	for(int j=0;j<ar.length;j++)
	{
		System.out.println("enter the value");
		ar[i][j]=sc.nextInt();
	}
	
}
System.out.println("display elements");

for(int i=0;i<ar.length;i++)
{
	for(int j=0;j<ar.length;j++)
	{
	System.out.print(ar[i][j]+" ");	
	}
	{
	System.out.println();

	}
}
	}
}
