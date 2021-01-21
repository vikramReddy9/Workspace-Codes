package com.smimplementation;
import java.util.Scanner;
import com.bean.SupermarketDetails;
public class ProdutcsImplementation {
Scanner sc=new Scanner(System.in);
SupermarketDetails[]addproducts=new SupermarketDetails[3];
ProdutcsImplementation pi=new ProdutcsImplementation();//exceeded more than 50 words so it will show stack over flow error
public void addproducts()
{
	for(int i=0;i<addproducts.length;i++)
	{
		System.out.println("Enter the product id");
		int product_id=sc.nextInt();
		System.out.println("Enter the product name");
		String product_name=sc.next();
		System.out.println("Enter the product id");
		double product_price=sc.nextDouble();
		System.out.println("Enter the product id");
        int product_qty=sc.nextInt();
        SupermarketDetails sd=new SupermarketDetails(product_id,product_name,product_price,product_qty);
        addproducts[i]=sd;
		System.out.println("products added successfully");
	}
}
public SupermarketDetails[] viewAllproducts()
{
	return addproducts;
}
public SupermarketDetails viewproduct(int product_id)
{
	for(SupermarketDetails k:addproducts)
	{
		if(k!=null)
		{
			if(k.getProduct_id()==product_id)
			return k;
			}
		}
	return null;
}
public void updateproduct(int product_id)
{
	int k=0;
	for(SupermarketDetails p:addproducts)
	{
		if(p!=null)
		{
			if(p.getProduct_id()==product_id)
	{
		k++;
		System.out.println("do you want to update product 1)name2)price3)qty");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("enter the  product name");
			String product_name=sc.next();
			p.setProduct_name(product_name);
			System.out.println("name is updated");
			break;
		case 2:
			System.out.println("enter the price");
			double product_price=sc.nextDouble();
			p.setProduct_price(product_price);
			System.out.println("price is updated");
			break;
		case 3:
			System.out.println("enter the qty");
			int product_qty=sc.nextInt();
			p.setProduct_qty(product_qty);
			System.out.println("price is updated");
			break;

		}
	}
		}
	}// end of for loop
	if(k==0)
System.out.println("product not found");
}
public void deleteproduct(int product_id)
{
	int k=0;
	int i=0;
	for(SupermarketDetails d:addproducts)
	{
		if(d!=null)
		{
	if(d.getProduct_id()==product_id)
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
public void buyproduct(int product_id,int qty)
{
	SupermarketDetails[]s=viewAllproducts();
	for(SupermarketDetails k:s)
	{
		System.out.println(k.getProduct_id()+"\t" +k.getProduct_name()+"\t"+k.getProduct_price()+"\t"+k.getProduct_qty());
	}
	System.out.println("which product you want to buy");
	int kid=sc.nextInt();
	System.out.println("how many products you want to buy");
	int sid=sc.nextInt();

	for( SupermarketDetails p:addproducts)
	{
		if(p!=null)
		{
	if(p.getProduct_id()==product_id)
	{
		double product_price=p.getProduct_price()*qty;
		System.out.println("total price of the product:"+product_price);
		p.setProduct_qty(p.getProduct_qty()-qty);
	}
		}
	}//end of for loop
}
}
