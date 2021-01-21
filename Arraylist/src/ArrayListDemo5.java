import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;

public class ArrayListDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s= new Student(100, "vik", "hyd");
Student s1= new Student(100, "ram", "sec");
Student s2= new Student(100, "ya", "suchitra");
Student s3= new Student(100, "ammu", "honeyH");
//ArrayList<Student> a=new ArrayList<>();
Collection<Student> a=new ArrayList<>();
a.add(s);
a.add(s1);
a.add(s2);
a.add(s3);
System.out.println(a);
for(Student st:a)
	System.out.println(st);
	}

}
