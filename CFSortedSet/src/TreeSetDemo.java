import java.util.TreeSet;
public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SortedSet(Interface)--->1)It is Extending to Set(Interface)2)It represents only similar type of elements(homogeneous)
				//3) Elements will be stored based on default natural sorting order(ascending order)
				//---> some methods1)first()2)last()3)tailSet(greater than Object obj)4)headSet(lesser than Object obj)5)subSet(in between Object obj,Object obj1)
				// SortedSet extends Set and this interface contains the method inherited from the set interface and adds a feature that stores all the elements in this interface to be stored in sorted manner
		//TreeSet(Class)---->1)It represents only similar type of elements(homogeneous) 2)Elements will be stored based on default natural sorting order(ascending order)
				//3)Null insertion is not available(Null pointer Exception)
				//4)Objects/elements should implement comparable interface(if you are adding any elements(non comparable that is string and integer) you will get Class Cast Exception) 
				//5)String,Wrapper classes by default implements Comparable interface other than this if we are adding any other objects it will give Class Cast Exception
		//whenever we try to add the elements to TreeSet the elements should be comparable		
		TreeSet tr= new TreeSet();
			tr.add(250);
			tr.add(50);
			tr.add(400);
			tr.add(500);
			//tr.add(null);//Null point Exception
			//tr.add("new");//class cast exception
			System.out.println(tr);
			System.out.println(tr.first());
			System.out.println(tr.last());
			System.out.println(tr.tailSet(200));// greater than or equal to  so 250,400,500(>=)
			System.out.println(tr.headSet(300));//less than  so 50,250(<)
			System.out.println(tr.subSet(100,300));// in between(100 and 300)
			
	}

}
