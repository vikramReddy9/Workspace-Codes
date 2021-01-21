import java.util.Arrays;

public class SortStrng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="lkjihgfedcba";
char[] ch=str.toCharArray();
Arrays.sort(ch);
for(char c:ch)
{
	System.out.println(c);
}
}
}