package array;

public class even {
	int ar[]={10,5,2,8,9};
	void evn()
	{
		for(int i=0;i<5;i++) 
			if(ar[i]%2==0)
			{
			System.out.println(ar[i]);	
			}
			
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		even e=new even();
		e.evn();

	}

}
