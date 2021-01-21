import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee1 e=new Employee1(104, "vik");
Employee1 e1=new Employee1(105, "wik");
Employee1 e2=new Employee1(101, "xik");
Employee1 e3=new Employee1(102, "yik");
Employee1 e4=new Employee1(103, "zik");
TreeSet<Employee1>tr=new TreeSet<Employee1>();
tr.add(e);
tr.add(e1); 
tr.add(e2);
tr.add(e3);
tr.add(e4);// here by taking integer numbers in to comparison it is executing .
System.out.println(tr);
for(Employee1 ep:tr)
{
System.out.println(ep.getEno()+" "+ep.getEname());

}
	}

}
