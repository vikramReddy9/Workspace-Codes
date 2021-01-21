
package array;

public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]=new int [3];
	ar[0]=100;
	ar[1]=200;
	ar[2]=300;
	for(int i=0;i<ar.length;i++)// length is a non static property which is used to find the length of the array 
	{
		System.out.println(ar[i]);
	}
	for(int j: ar)
	{
		System.out.println(j);// syntax of for each loop (datatype variable : object name(array/student/collection))
		
	}
	}

}
