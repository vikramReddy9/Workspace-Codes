package langpackage;

public class Finalize {
@Override
protected void finalize() throws Throwable {
	// TODO Auto-generated method stub
	System.out.println("finalized method"); //finally concept will be explained in exception handling//
	super.finalize();// finalize methods is trying to perform cleanup operations and called by GC //
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Finalize f=new Finalize();
System.out.println(f.hashCode());
System.out.println(f.getClass().getName());
System.out.println(f.getClass());// to get class name 
f=null;// we use null to clean up operations in garbage collector concept//
System.gc();// Garbage collector is available in System class //
try {
	Thread.sleep(10000);// will be explained in multi-threading concept and here GC is calling finalize method for performing clean up operations
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
System.out.println("welcome");
	}

}
