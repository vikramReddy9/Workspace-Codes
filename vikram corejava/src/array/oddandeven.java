package array;

public class oddandeven {
	int ar[]={10,5,2,8,9};
	void od()
	
	{
		for(int i=0;i<5;i++) 
			if(ar[i]%2==1)
			System.out.println(ar[i]);	
	}
	void evn()
	{
		for(int i=0;i<5;i++) 
			if(ar[i]%2==0)
				
			System.out.println(ar[i]);	
		
	}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
oddandeven o=new oddandeven();
System.out.println("odd numbers");
o.od();
System.out.println("even numbers");
o.evn();
	}
}
