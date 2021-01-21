import java.util.Comparator;
import java.util.TreeSet;
class MyCom implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String str1=o1.toString();
		String str2=o2.toString();
		return str2.compareTo(str1);
	}
	
}
public class TreeSetComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet tr=new TreeSet(new MyCom());// StringBuffer is predefined class for this we cannot implement comparable interface{String,Wrapper classes} but we can implement comparator 
		tr.add(new StringBuffer("abhinav"));
		tr.add(new StringBuffer("pradeep"));
		tr.add(new StringBuffer("anirudh"));
		tr.add(new StringBuffer("vik"));
		tr.add(new StringBuffer("praneeth"));
		System.out.println(tr);
	}// By default TreeSet is ascending order so in order to get descending order we can use comparator

}
