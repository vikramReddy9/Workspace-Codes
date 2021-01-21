
public class Student {
	private int sno;
	private String sname;
	private String sadd;
	
	public Student(int sno, String sname, String sadd) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.sadd=sadd;
	}

	@Override
	public String toString() {
		return  sno + " " + sname + " " + sadd+" " ;// toString method is the String representation of the object we can override toString method
		// here what ever we give it prints the same.
	}
	
}
