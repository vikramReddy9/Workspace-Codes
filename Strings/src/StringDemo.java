
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("vik".toUpperCase());// String to upper case
		System.out.println("  validuser  ");
		System.out.println("VALID".toLowerCase());//String to lower case
		System.out.println(" validuser ".trim());//string trim method
		System.out.println("validuseradmin".replace('a', 'A'));//replace
String str="welcome to java programming welcome";
System.out.println(str.replaceAll("welcome","java"));
System.out.println(str.replaceFirst("welcome", "java"));
System.out.println("vikram".charAt(1));//1 based on index it will give value 
String str1="hello";
char ch[]=str1.toCharArray();//converting String to array 
for(char c:ch)
	System.out.println(c);

String name=String.copyValueOf(ch);//array to String
System.out.println(name);
System.out.println("validuseradmin".substring(4));//substring
System.out.println("validuseradmin".substring(0,11));//substring
System.out.println(String.valueOf(true));// can convert any information to string
System.out.println(String.valueOf(ch));// can convert to any information to string
System.out.println("validuseradmin".indexOf('a'));// first occurrence will be displayed
System.out.println("validuseradmin".indexOf('a',2));// after 2nd index the char will be displayed

	}

}
