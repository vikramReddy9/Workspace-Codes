import java.util.ArrayList;

public class Demoarraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList al=new ArrayList();
al.add(100);
al.add("vik");
al.add('a');
al.add(100);
al.add(null);
System.out.println(al);
al.add(500);
System.out.println(al);
al.add(1,"ramya");
System.out.println(al);
System.out.println("===================");
for(Object obj:al)
	System.out.print(obj+" ");
System.out.println();
System.out.println("======================");
Object obj1=al.get(1);
String name=(String)obj1;// type casting as the 1st index is ramya it is a string so working with collection frame work type casting is mandatory
System.out.println(name);
System.out.println("======================");
for(int i=0;i<al.size();i++)
{
Object obj=al.get(i);
System.out.print(obj+" ");
	}
	}
}
