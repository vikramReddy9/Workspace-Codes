
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
class MyCompar implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);// to perform descending order we will use compareto method
	}

}
public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//By default natural sorting order is ascending based on keys it will store
// It contains unique entries{it wont allow duplicate elements}
// It is non synchronized
// Keys should be homogeneous 
// Keys should implement comparable interface {by default String and Wrapper classes implements comparable interface}
		TreeMap<Integer,String>tm=new TreeMap<>(new MyCompar());
		tm.put(100,"Vik");
		tm.put(400, "sam");
		tm.put(200, "Ram");
		tm.put(500, "love");
		tm.put(300, "Ya");
		System.out.println(tm);
			/*for(Map.Entry m:tm.entrySet())
			{
				System.out.println(m.getKey()+"\t"+m.getValue());//m.getKey()&m.getValue() are available in Entry(Interface) and Entry(Interface) is available in Map
			}*/ // for iterating we use for each
		/*System.out.println(tm.descendingKeySet());
		System.out.println(tm.tailMap(200));//>={200,300,400,500}
		System.out.println(tm.headMap(400));//< 100,200,300
		System.out.println(tm.subMap(100, 500));*/
	}

}
