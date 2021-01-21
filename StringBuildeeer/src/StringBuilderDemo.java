
public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1)SB is mutable{once if we update a string. the older string will be deleted }
		//2)all methods are non synchhronized
		//3)all methods what we used in StringBuffer we can use them in StringBuilder
		StringBuilder sb=new StringBuilder();
		sb.append("star ");
		System.out.println(sb.capacity());
		System.out.println(sb);
		sb.append("shiva is a star");
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.ensureCapacity(2000);

	}

}
