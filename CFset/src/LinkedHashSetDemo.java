import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initial capacity is 16 
		//2) LinkedHashSet--->
				//1)DataStructure is DoubleLinkedList+HashTable
				//2)Insertion order is preserved (based on index) 3)Null insertion is possible 4)Heterogeneous objects are allowed
				//5)usage---> cache based applications we prefer to use LinkedHashSet
		LinkedHashSet<Integer>lhs=new LinkedHashSet();
		lhs.add(20);
		lhs.add(4);
		lhs.add(0);
		lhs.add(2);
		lhs.add(1);
		lhs.add(25);
		lhs.add(3);
		lhs.add(3);//it wont allow duplicate elements
		System.out.println(lhs);
		
	}

}
