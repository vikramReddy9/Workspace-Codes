package com.Client;
import java.util.Scanner;
import Product.implementation.ProductImp;
import com.bean.Product;
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ProductImp pi=new ProductImp();
while(true)
{
	System.out.println("1)Add product");
	System.out.println("2)View All products");
    System.out.println("3)View product");
    System.out.println("4)update product");
    System.out.println("5)Delete product");
    System.out.println("6)Buy product");
    System.out.println("7)Exit");
    System.out.println("Enter your choice");
    
    
    int choice=sc.nextInt();
    switch(choice)
    {
    case 1:
    	pi.addproducts();
    	break;
    case 2:
    	Product[]k=pi.viewAllproducts();
    	System.out.println("================");
    	System.out.println("pid\tpname\tpprice");
    	System.out.println("================");
    	for(Product p:k)
    		if(p!=null)
    		{
    			System.out.println(p.getPid()+"\t" +p.getPname()+"\t"+p.getPprice());
    	}
    	break;
    case 3:
    	System.out.println("Enter the product number");
    	int pno=sc.nextInt();
    	Product m=pi.viewproduct(pno);
    	if(m!=null)
    	{
    		System.out.println(m.getPid()+"\t" +m.getPname()+"\t"+m.getPprice());
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
		System.out.println("Enter the product name");
		String pname=sc.next();
		pi.buyproduct(kid);
		break;
	case 7:
		System.out.println("thanks for using app");
		System.exit(0);
		break;
		default:
			System.out.println("Enter between the choices");    	
    }
}


	}

}
