import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// HashTable is a legacy class{it means old classes}
//HashTable is similar to HashSet but have some differences 
// HashTable methods are synchronized where as HashSet methods are non Synchronized.
// HashSet allows null once but HashTable does'nt allow null value
//DataStructure is HashTable,Insertion order is not preserved,it wont allow duplicate elements.
//Each and every element is stored based on HashCode of the object (list classes stored based on index as sequentially)
//Heterogeneous objects are allowed.
//HashTable capacity is 11 where as HashSet is 16.
		Hashtable<Integer,String>ht=new Hashtable<>();
		ht.put(12,"x");
		ht.put(2,"c");
		ht.put(4,"c");// no duplicate keys but we can give duplicate values
		ht.put(0,"c");
		ht.put(6,"d");
		ht.put(8,"e");
		ht.put(7,"f");
		ht.put(1,"g");
		ht.put(3,"h");// it works similar to HashSet but instead in opposite direction{here out put will be 12=x,8=e,7=f,6=d,4=c,3=h,2=c,1=g,0=c}
		//ht.put(null,"ss");// Null point Exception
		System.out.println(ht);// Every CollectionFramework is implemented toString()
// 

	}

}
