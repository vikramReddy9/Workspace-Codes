
public class ThrowsDemo1 {
void display()throws Exception
{
	System.out.println(100/0);
}
	public static void main(String[] args) {// throws keyword we try to specify along with methods
		// TODO Auto-generated method stub
		ThrowsDemo1 td= new ThrowsDemo1();//if we write specific exception it wont show erroer
		try {
			td.display();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("bigboss");
	}

}
