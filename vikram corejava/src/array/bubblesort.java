package array;

public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int ar[]={9,8,3,2,1};
int temp;
for(int i=0;i<ar.length;i++)
{
	for(int j=0;j<ar.length-1;j++)
	{
	if( ar[j]>ar[j+1])
			{
		temp=ar[j];
		ar[j]=ar[j+1];
		ar[j+1]=temp;
			}
}
}
for(int i=0;i<ar.length;i++)
{
System.out.print(ar[i]+" ");
	}
	}
}

