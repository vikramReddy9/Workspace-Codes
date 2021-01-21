
public class ThrowsDemo implements Cloneable {
int i=100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// using throws keyword we can throw the exception to object calling place.
//In calling place we can handle exception using try and catch block
	//using throws keyword we can declare the exception along with the method .
// more than one exception we can write using throws keyword
	//once you got an exception try to throw the exception object to calling place.
		ThrowsDemo demo=new ThrowsDemo();
		ThrowsDemo demo1=null;
		try {
			 demo1=(ThrowsDemo)demo.clone();
			 System.out.println(demo.i+"\t"+demo1.i);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
