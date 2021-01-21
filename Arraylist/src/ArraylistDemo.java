import java.util.ArrayList;

public class ArraylistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// List(Interface) has three child classes 1)ArrayList(Class) 2)LinkedList(Class) 3)Vector(By default it has Synchronized methods basically we use this in MultiThreaded applications)
		// ArrayList initial capacity is 10 to increase capacity {(current capacity)*(3/2+1)}
ArrayList a=new ArrayList();
a.add(100);
a.add("vik");
a.add(200);
a.add(100);
System.out.println(a);
ArrayList a1=new ArrayList();
a1.add(100);
a1.add(200);
System.out.println(a1);
a.addAll(a1);// using addAll method we are adding two arrays information here a and a1 are two separate array we are adding a1 array list to a array list  
System.out.println(a);
//a.remove(0);// by using remove method based on index value we can remove the information from the array 
//System.out.println(a);
//a.removeAll(a1);// by using the remove all 	method it will remove all the elements which are common here 100,200 in a1 but they are available in a as well so it removes everything and returns only vik here
//System.out.println(a);
a.retainAll(a1);// by using retain all only common elements will be present and the other elements will be deleted here 100,200,100,100,200 will be displayed and vik will be deleted 
System.out.println(a);
a.clear();
System.out.println(a);
	}

}
