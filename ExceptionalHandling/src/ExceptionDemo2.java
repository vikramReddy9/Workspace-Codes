
public class ExceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;// we can declare outside and can access inside the try block.
		int y=0;
		try{// dont declatre bvariables inside the try {it acts as local variable}. we can assign inside try it is ok
		 x=10;// we cant write any statement inbetween try and catch block it will give compilation error
		 y=x/0;// It is a logical mistake {It generates exception (i.e at run time).So,further statement will not be executed 
		System.out.println(y);// it will give arthimetic exception {what ever exception is generated that will pass to jvm} jvm will handle that exception
	}
        //Exception e=new ArithmeticException(); the object is assigned exception(e) reference varaiable
		catch(Exception e){// we can give specific exceptions {i.e Arthimetic Exception,NullPointerException}
			//System.out.println(e);//If you print 'e' it will give Exception className and Exception message{ output:java.lang.ArithmeticException}
			//System.out.println(e.getMessage());//If we want only message to be displayed we can use getMessag{output: / by zeroe()}
		e.printStackTrace();// in which line Exception is generated{output:java.lang.ArithmeticException: / by zero
		//at ExceptionDemo2.main(ExceptionDemo2.java:8)}
		//System.out.println(e.toString());
		}
		finally
		{
			System.out.println("clean up operations");//It will execute before terminating the application 
		}
		{
		System.out.println("welcome boss"+x);
	}//try can have more than one catch block.
	//catch block can handle multiple exceptions.In real time we handle checked Exceptions.
}
}
