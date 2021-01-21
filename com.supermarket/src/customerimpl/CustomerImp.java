package customerimpl;
import java.util.Scanner;
import com.bean.SupermarketDetails;
import com.smimplementation.ProdutcsImplementation;
public class CustomerImp {
	SupermarketDetails[]addproducts=new SupermarketDetails[3];
	public void digital() 
	{
		Scanner sc=new Scanner(System.in);
		ProdutcsImplementation pi=new ProdutcsImplementation();
		// TODO Auto-generated method stub
		while(true)
		{
			System.out.println("1)View All products");
		    System.out.println("2)View product");
		    System.out.println("3)Buy product");
		    System.out.println("4)Back");
		    System.out.println("Enter your choice");
		    int choice=sc.nextInt();
		    switch(choice)
		    {
		        case 1:
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
		    case 2:
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
		    case 3:
				System.out.println("Enter the product number");
				int kid=sc.nextInt();
				System.out.println("Enter the product qty");
				int pqty=sc.nextInt();
				pi.buyproduct(kid,pqty);
				break;
			case 4:
				System.exit(0);
				break;
		
		}
		}
		}
	public void add() {
		// TODO Auto-generated method stub
		
	}
	}
