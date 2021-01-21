import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initial storage capacity is 16.
		//set have two classes 1)HashSet(Class)2)LinkedHashSet(Class)
        //1)HashSet--->
		//1)DataStructure is HashTable,Insertion order is not preserved.it wont allow duplicate elements.
	    //2)Each and every element is stored based on HashCode of the object (list classes stored based on index as sequentially)
		//3)Heterogeneous objects are allowed.4)Null insertion is possible.5)All methods are non synchronized.
		//6)usage--> when we are performing search related operations we can use set methods.
		// There are 3 Algorithms 1)linear search2)binary search3)hashing mechanism	
	//set does not have any methods it uses collection methods {even HashSet also does not have any proper methods}
		HashSet<Integer>hs=new HashSet<>();
		hs.add(20);
		hs.add(4);
		hs.add(0);
		hs.add(2);
		hs.add(1);
		hs.add(25);
		hs.add(3);
		hs.add(25);// no duplicate elements
		System.out.println(hs);// Every CollectionFramework is implemented toString()
	}
}
