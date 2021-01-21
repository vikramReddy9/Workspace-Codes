import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// stack---> It is a linear data structure{LIFO-->Last In First Out}
// It is used to store collection of Objects.It is based on LIFO.
//CollectionFrameworks provides many interfaces and classes	to store the collection of objects one of them is stack class
//Stack is a subclass of vector. methods in vector,list and collections we can use them in stack.
// stack datastrure has two important operations 1)push----->Insterting the elements into the stack
		//2)pop---->removes an element from top of the stack.
// some methods like-->1)Empty() 2)push() 3)pop() 4)peek()--> only shows top of the element 5)search(Object Obj)
// we can itereate by {for each,iterator,listiterator,enumeration}
Stack<Integer>s=new Stack<>();
boolean result=s.empty();
System.out.println(result);
s.push(200);
s.push(100);
s.push(400);
s.push(300);
s.push(500);
System.out.println("Print The Elements Of The Stack : "+s);
  result=s.empty();//--->return type is boolean if elements are present it will return true otherwise it returns false
	System.out.println(result);
	Integer i=s.peek();//display 500 as it is in the top {LIFO}
System.out.println(i);
System.out.println(s);
s.pop();//removes the top of the element i.e 500{LIFO}
System.out.println(s);
int loc=s.search(300);// returns the position of 300 if object is not there returns -1
System.out.println(loc);
	}

}
