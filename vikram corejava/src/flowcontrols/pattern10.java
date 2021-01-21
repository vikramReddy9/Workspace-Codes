package flowcontrols;

public class pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2;i<=50;i++){
		int c=0;
		for(int j=2;j<=i;j++){
			if(i%j==0)c++;
		}
		if(c==1)System.out.println(i);

	}
	}
}
