import java.util.ArrayList;

public class ArrayListDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> a=new ArrayList<>();
a.add("vik");
a.add("sam");
a.add("sid");
a.add(null);
String name=a.get(1);
System.out.println(name);
System.out.println(a);
}

}
