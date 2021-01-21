
public class himasalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double salary=85000;
int ta=15;
int da=20;
int Hra=18;
int pf=20;
int tax=25;
System.out.println("salary of hima="+salary);
double ta_amt=(ta*salary)/100;
double da$amt=(da*salary)/100;
double hra_amt=(Hra*salary)/100;
double Gross$amt=(salary+ta_amt+da$amt+hra_amt);
System.out.println("Gross amount of hima="+Gross$amt);
double pf_amt=(pf*salary)/100;
double tax$amt=(tax*salary)/100;
double Net_amt=(Gross$amt-pf_amt-tax$amt);
System.out.println("total net amount="+Net_amt);
}
}
