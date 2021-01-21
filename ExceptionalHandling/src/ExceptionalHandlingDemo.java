
public class ExceptionalHandlingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// In any programming language we usually get two types of errors
//1)Compile Time Error---->when we are trying to compile it checks that path is setted properly or not and checks for syntatical mistakes.
//2)Run Time Error--->Once application is compiled and during execution time if you have any logical mistakes it will generate run time error.
// All java run time errors are exceptions.
// Exception Handling--->Handling the exception at run time.Once exception is generated instead of avoiding it is better to handle exception and run the application.
//when unwanted,unexpected event that distrubs a normal flow of program is called exception.
//An Exception is an abnormal condition that is occured during the runtime of an application or
//An Exception is an unusal event occured during the execution of a program or
//Exceptions are objects under execution of a program created by jvm it represents the corresponding logical errors.
//Note: An exception occurs at runtime but each runtime error is not on Exception.
// There are 5 keywords to handle exceptions-->1)try 2)catch 3)finally 3)throws 5)throw.
// Exception hierarchy ---> Throwable(root class) is a class it extends Object class.
// Throwable class has 2 child classes---->1)Exception(sub class) 2)Error(sub class)
// Error--->It is non recoverable exception.These exceptions cannot be handled by developer{OutOfmemoryError,StackOverFlowException}
//Exception--> it is a class. These are recoverable exception. we can handle this exceptions{RunTimeException-->Arthimetic,NullPointer,NumberFormatExceptions these are sub classes of run time exceptions these are called as unchecked Exceptions}
//sequelException--> whenever you are trying to interacting with database software. {any situation may be insertion,deletion,update time there is a chance to get exception that is called as sqlException}
//sqlException is called checked Exception{usually these exceptions are generated during database(jdbc)}
//IoException-->InputOutputException{while reading and writing data from keyboard in that moment there is a chance to get exception }(FileNotFoundException}.these are usually generated when we are trying to interact with files.
//IntereptedException--->This Exception cannot be handled.Usually it is generated in MultiThreaded Applications.
//Except Run Time Exceptions all are CheckedExceptions.
// try having capability to hold business logic.we cannot write only try block. Try is associated with Catch block
// In try block we can write risky code (i.e business logic).Once we write business logic exception will be generated and it reach back to Catch block.In catch block we try to handle exception. 
	
	}

}
