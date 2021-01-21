import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee(104, "vik");
		Employee e1=new Employee(105, "wik");
		Employee e2=new Employee(101, "xik");
		Employee e3=new Employee(102, "yik");
		Employee e4=new Employee(103, "zik");
		ArrayList<Employee>al=new ArrayList<>();
		al.add(e);
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
	System.out.println(al);
	Collections.sort(al);// ArrayList is not ascending order so in order to do sorting we need to use .sort {its default in TreeSet so in TreeSet we don't write .sort method to sort}
	for(Employee em:al)
	{
		System.out.println(em.getEno()+" "+em.getEname());
	}
	}

}
