package array;

public class minimum {
	int ar[]={10,5,36};
	void min()
	{ 
		int k=ar[0];
		for( int i=0;i<ar.length;i++)
			if(k>ar[i])
				k=ar[i];
		System.out.println(k);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		minimum m= new minimum();
		m.min();
		
	}

	
}
