import java.util.LinkedList;
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<Integer> li=new LinkedList<>();// here we are using generics concept so that we can provide homogenious elements
li.add(100);
li.add(200);
li.add(100);
li.add(null);// null insertion is possible
System.out.println(li);
li.addFirst(110);
System.out.println(li);
li.addLast(300);
System.out.println(li);
	}

}
