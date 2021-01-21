//For UserDefined classes if you want to perform sorting then you need to implement Comparable here for Employee we have implemented Comparable interface
public class Employee1 implements Comparable<Employee1> {
	private int eno;
	private String ename;
	public Employee1(int eno, String ename) {
		super();
		this.eno = eno;
		this.ename = ename;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	@Override
	public int compareTo(Employee1 emp) {
		// TODO Auto-generated method stub
		if(eno<emp.eno)
		return -1;
		if(eno>emp.eno)
			return +1;
		else
			return 0;
	}

}
