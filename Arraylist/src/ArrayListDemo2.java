import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		a.add(100);
		a.add("vik");
		a.add(200);
		a.add(100);
		System.out.println(a);
Object[]elements=a.toArray();// using toArray method we can convert collection to array 
for(Object obj:elements)
System.out.println(obj);
	}

}
