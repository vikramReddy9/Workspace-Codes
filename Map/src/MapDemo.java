import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;// ctrl+shift+O we can get the import classes

public class MapDemo {
// download Oracle 11g (Express Edition Windows 64bit)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// map is a set of keys and values
		// map is a interface its not under collections framework
		// combimnation of key and value we can call as a entry.
		
	//  child classes for Map Interface are and they rae implemented classes.	
		// 1)HashMap 2)LinkedHashMap 3)IdentityHashMap 4)WeekHashMap5)SortedMap 6)NavaigableMap 7)TreeMap
		//some methods they are 1)void put(key,value) 2)voidputAll(Map m)--> to add a group of Key-Value pairs 3)Object get(Object Key)4) Object remove(Object Key)
//5) Set(return type) KeySet()--> we can Set keys 6)Collection(return type) Values--> we can get values 7)Set(return type) entrySet()--->we can get both key and value as a object
		//we dont have any specific methods for iteratio.
// Entry(Interface)--> Interface inside we are having one more interface that is  Entry(Interface).
		//Entry key will be stored based on HashCode of the key.
		// Entry key methods are -->1)getKey()2)getValue()3)SetValue()
		//HashMap--->
		//1)represent group of Object as a key and pair of value is called HasMap
		//2)data structure is HashTable
		//3)duplicate keys are not allowed,values can be duplicated
		//4)Heterogeneous objects are allowed both key and ValuePair.
		//5)intial capacity is 16.
		//6)only once null insertion is possible.
// Note: In search related operations we can use HashMap(Based on Key we can get the values so in search related operations we can use HashMap).
	HashMap<Integer,String>hm=new HashMap<>();
	hm.put(100,"Vik");
	hm.put(200, "ram");
	hm.put(300, "nic");
	hm.put(400, "sic");//Each and every key will be stored based on HashCode of the key. 
	hm.put(400, "ramya");// here insted of sic it will give ramya because it will replace as the keys are same.
	System.out.println(hm);
	String str=hm.get(400);
	System.out.println(str);
	Set<Integer> s=hm.keySet(); // using KeySet method we can get the keys and store it in the Set.	
	for(Integer i:s)
	{
		System.out.print(i+" ");
	}
	System.out.println(); 	
 Collection<String>c=hm.values();// using values we can get the values and store it in the Collection.
 for(String S:c)
 {
	 System.out.println(S);
 }
 Set Entry=hm.entrySet();// return type is set to get both keys and values we use entrySet 
	System.out.println(Entry);
	for(Map.Entry m:hm.entrySet())
	{
		System.out.println(m.getKey()+"\t"+m.getValue());//m.getKey()&m.getValue() are available in Entry(Interface) and Entry(Interface) is available in Map
	}
	}
}
