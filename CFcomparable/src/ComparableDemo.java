
public class ComparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Comparable is a interface available in java.lang.*;
//CompareTo(Object O)---->  This method is comparing two objects.
//if O1 comes before O2 it will give negative.
//O2 comes before O1 it will give positive. 
//O1=O2 then it will return 0.
		System.out.println("A".compareTo("Z"));// Here it will return negative value as "A" will come before "Z"
		System.out.println("Z".compareTo("A"));//Here it will give positive value as "Z" will come after "A"
		System.out.println("A".compareTo("A"));//Here it will give 0 as both the objects are same.
		//compareTo(Object obj);
	}

}
