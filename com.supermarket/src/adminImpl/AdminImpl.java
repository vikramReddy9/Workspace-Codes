package adminImpl;
import java.util.Scanner;
import com.bean.SupermarketDetails;
import com.smimplementation.ProdutcsImplementation;
public class AdminImpl {
	public void display ()
	{
			Scanner sc=new Scanner(System.in);
			ProdutcsImplementation pi=new ProdutcsImplementation();
	while(true)
	{
		System.out.println("1)Add product");
		System.out.println("2)View All products");
	    System.out.println("3)View product");
	    System.out.println("4)update product");
	    System.out.println("5)Delete product");
	    System.out.println("6)Back");
	    System.out.println("Enter your choice");
	    int choice=sc.nextInt();
	    switch(choice)
	    {
	    case 1:
	    	pi.addproducts();
	    	break;
	    case 2:
	    	SupermarketDetails[]k=pi.viewAllproducts();
	    	System.out.println("================");
	    	System.out.println("pid\tpname\tpprice\tpqty");
	    	System.out.println("================");
	    	for(SupermarketDetails p:k)
	    		if(p!=null)
	    		{
	    			System.out.println(p.getProduct_id()+"\t" +p.getProduct_name()+"\t"+p.getProduct_price()+"\t"+p.getProduct_qty());
	    	}
	    	break;
	    case 3:
	    	System.out.println("Enter the product number");
	    	int pno=sc.nextInt();
	    	SupermarketDetails m=pi.viewproduct(pno);
	    	if(m!=null)
	    	{
	    		System.out.println(m.getProduct_id()+"\t" +m.getProduct_name()+"\t"+m.getProduct_price()+"\t"+m.getProduct_qty());
	    	}
	    	else
	    	{
	    		System.out.println("Given record not found");
	    	}
	    	break;
	    case 4:
	    	System.out.println("Enter product number");
			int upid=sc.nextInt();
			pi.updateproduct(upid);
			break;
			
		case 5:
			System.out.println("Enter the product number");
			int pid=sc.nextInt();
			pi.deleteproduct(pid);
			break;
		case 6:
			System.out.println("Enter the product number");
			int kid=sc.nextInt();
			System.out.println("Enter the product qty");
			int pqty=sc.nextInt();
			pi.buyproduct(kid,pqty);
			break;
		case 7:
			System.exit(0);
			break;
	
	}
	}
	}
}
