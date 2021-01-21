import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
// Based on the key if you want to set then we can use this method.
	//based on the key the values will be stored. 
	//insertion order is preserved.
	//DataStrucre is doubleLinked and HashTree
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer,String>hm=new LinkedHashMap<>();
		hm.put(100,"Vik");
		hm.put(200, "ram");
		hm.put(300, "nic");
		hm.put(400, "sic"); //based on key the values will be stored
		hm.put(400, "ramya");// what way we added it will print in the same way as it follows insertion order
		System.out.println(hm);

	}

}
