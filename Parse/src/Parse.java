
public class Parse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//any type of information if you are passing in java application by default it is String format 
		// that string information should be converted into appropriate format for this we use xxxparsexxx(String str)
		//it will be usually stored in {String[] args}
		System.out.println();
		int sno=Integer.parseInt(args[0]);
		String sname=args[1];
		double d=Double.parseDouble(args[2]);
		System.out.println(sno+"\t"+sname+"\t"+d);
// from command prompt we are trying to passing this data. the same data comes to application and converting to appropriate type
// {right click --->Run as---->Run Configuration---> Arguments}in Arguments sector we can assign those values
	}

}
