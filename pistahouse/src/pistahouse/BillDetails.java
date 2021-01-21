package pistahouse;

public class BillDetails {
	
int TotalBill;
void TotalBill() 
{
	BiryaniDetails B=new BiryaniDetails();
	
	DrinksDetails D=new DrinksDetails();
	
	IcecreamDetails I=new IcecreamDetails();
	
	TotalBill=(B.Tcbp+B.Tmbp+B.Tvbp+D.Tutp+D.stp+D.tteap+D.tcoffeep+I.Tbsp+I.Tvp);
	System.out.println("Total bill="+ TotalBill);
}
}
