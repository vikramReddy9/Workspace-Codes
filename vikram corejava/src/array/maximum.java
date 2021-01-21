package array;

public class maximum {
	int ar[]={10,15,36};
  void max()
  {
	int k=ar[0];
	for( int i=0;i<ar.length;i++)
		if(k<ar[i])
			k=ar[i];
	System.out.println(k);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		maximum m=new maximum();
	m.max();

	}

}
