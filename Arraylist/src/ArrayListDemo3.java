import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		a.add(100);
		a.add("vik");
		a.add(200);	
		a.add(100);
		System.out.println(a);

		Iterator i=a.iterator();// iterator----> collection(interface)
       while(i.hasNext())// using hasNext method we can check whether elements available or not if it has then the loop starts
       {
    	  Object obj=i.next();
    	  System.out.print(obj+" ");
       }
       System.out.println();
       
       
       System.out.println("====================");
       ListIterator li=a.listIterator();//ListIterator----->List interface(interface)
       while(li.hasNext())
       {
    	   Object obj1=li.next();// by using Next() we can get the objects
    	   System.out.print(obj1+" ");
       }
    	System.out.println();
    	 System.out.println("====================");
    	while(li.hasPrevious())// by using hasPrevious we can check whether the elements are available or not
    	{
    	Object obj2=li.previous();// by using previous() we can get the read the ArrayList in backward direction 
    	System.out.print(obj2+" ");
    	}
       System.out.println();
	}

}
