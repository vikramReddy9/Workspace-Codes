import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// vector is a legacy class. we can use both collection&List methods in vector and vector have its own methods as well
	//vector class has elements method its Returntype is enumeration(read the data in forward direction)
	// to iterate we use (Iterator,ListIterator,enumeration)	
		// Initial capacity is 10 and to increase capacity(capacity=2*current capacity) 
		Vector v=new Vector();
		v.add(100);
		v.addElement(230);
		v.add(1,"vik");
		System.out.println(v);
		// to Get the element from the vector class we can use both elementAt and get methods
	Object obj= v.get(1);
	System.out.println(obj);
	Object obj1=v.elementAt(2);
	System.out.println(obj1);
	//to iterate all the elements 
	Enumeration e=v.elements();// by using elements method we can iterate(get) the elements.They are stored in enumeration
	while(e.hasMoreElements())// hasMore is to check whether the elements are available in enumeration{it is a boolean either true or false}
	{
		Object ob=e.nextElement();// using next method we can get elements one by one 
		System.out.print(ob+" ");// we can use for,foreach,iterator,ListIterator,Enumeration
	}
	System.out.println();
	}

}
