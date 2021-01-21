
public class WrapperClassesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// by introducing wrapper classes now everything is an object before we cannot create objects for datatypes by using this concept we can create an object for the datatypes.
//1) it accepts primitive datatypes as arguments example -->Integer(int i),Double(double d).
//2)It accepts string as a argument (it should be primitive type)--->Integer(String str) example--->Integer("100") even though it accepts string as argument it should be given in primitive datatypes if not it will give numberformatexception		
//3)except character remaining datatypes having two predefined constructors
		Integer i=new Integer(100);// it will give 100 as output
		System.out.println(i);
		//Integer(Class) Convert to primitive type(here to int)
		int sno=i.intValue();//By using intValue we can convert wrapper class object to primitive type
		Integer i1=new Integer(100);
		System.out.println(i1.intValue());
		Integer i2=new Integer("shiva");
		System.out.println(i1);//it will give numberformatexception
		// we are having a class called Number . Number is a predefined class 
		// Number class has 6 methods--->
		//1)int intValue();2)byte byteValue();3)long longValue();4)short shortValue();5)float floatValue();6)double doubleValue();
		// Number classes have subclasses they are ---->
		//1)Byte2)Integer3)Float4)Long5)Double6)Shor
		// all the methods which are in number class we can use them in subclasses
		// any type of information if you are passing in java application by default it is String format 
		// that string information should be converted into appropriate format for this we use xxxparsexxx(String str)
		//
	}

}
