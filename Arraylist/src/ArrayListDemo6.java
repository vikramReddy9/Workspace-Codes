import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyCom implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		return i2.compareTo(i1);
	}
	
}
public class ArrayListDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer>al=new ArrayList<>();
al.add(100);
al.add(50);
al.add(85);// if you want to perform sorting operations the elements should be comparable 
al.add(45);
System.out.println(al);
Collections.sort(al,new MyCom());//Sorting can accept two arguments 1)collection(al) 2)comparator{MyCom()}
System.out.println(al);
	}
	}

