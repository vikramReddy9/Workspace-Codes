
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>al=new ArrayList<>();
		al.add(100);
		al.add(50);
		al.add(85);// if you want to perform sorting operations the elements should be comparable 
		al.add(45);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
	}

}
