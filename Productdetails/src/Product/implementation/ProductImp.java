package Product.implementation;
import java.util.Scanner;
import com.bean.Product;
public class ProductImp {
Scanner sc=new Scanner(System.in);
Product addproducts[]=new Product[3];
public void addproducts()
{
	for(int i=0;i<addproducts.length;i++)
	{
		System.out.println("Enter the product id");
		int pid=sc.nextInt();
		System.out.println("Enter the product name");
		String pname=sc.next();
		System.out.println("Enter the product price");
		double pprice=sc.nextDouble();
	Product p=new Product(pid,pname,pprice);
		addproducts[i]=p;
		System.out.println("products added sucessfully");
	}
	
}
public Product[] viewAllproducts()
{
	return addproducts;
}
public Product viewproduct(int pid)
{
	for(Product p:addproducts)
	{
		if(p.getPid()==pid)
			return p;
	}
	return null;
}
public void updateproduct(int pid)
{
	int k=0;
	for(Product p:addproducts)
	{
		if(p!=null)
		{
	if(p.getPid()==pid)
	{
		k++;
		System.out.println("do you want to update product 1)name2)price");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("enter the name");
			String pname=sc.next();
			p.setPname(pname);
			System.out.println("name is updated");
			break;
		case 2:
			System.out.println("enter the price");
			double pprice=sc.nextDouble();
			p.setPprice(pprice);
			System.out.println("price is updated");
			break;
		}
	}
		}
	}// end of for loop
	if(k==0)
System.out.println("product not found");
	}

public void deleteproduct(int pid)
{
	int k=0;
	int i=0;
	for(Product p:addproducts)
	{
		if(p!=null)
		{
	if(p.getPid()==pid)
	{
		addproducts[i]=null;
		System.out.println("product deleted");
		i++;
		k++;
	}
		}
	}//end of for loop
	if(k==0)
		System.out.println("product record not found");
}
public void buyproduct(int pid)
{
	Product[]s=viewAllproducts();
	for(Product k:s)
	{
		System.out.println(k.getPid()+"\t" +k.getPname()+"\t"+k.getPprice());
	}
	System.out.println("which product you want to buy");
	int kid=sc.nextInt();
	for(Product p:addproducts)
	{
		if(p!=null)
		{
	if(p.getPid()==pid)
	{
		System.out.println("given record is found");
	}
		}
	}//end of for loop
}
}
