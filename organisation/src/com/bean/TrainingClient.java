package com.bean;
import java.util.Scanner;
public class TrainingClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
while(true)
	
{
	System.out.println("1)Fast Track Batch");
	System.out.println("2)Corporate Track Batch");
	System.out.println("3)Weekend Track Batch");
	System.out.println("4)Exit");
	int choice=sc.nextInt();
	switch(choice)
	{
	case 1:
		Fasttrackbatch ft=new Fasttrackbatch();
		ft.setSid(100);
		ft.setSname("vikram");
		ft.setSmobile(7306044998l);
		ft.setSadd("hyderabad");
		ft.setScourse("Java");
	  double sfee=ft.calculatefee(ft.getScourse());
		System.out.println(ft.getSid()+"\t"+ft.getSname()+"\t"+ft.getSmobile()+"\t"+ft.getSadd()+"\t"+ft.getScourse()+"\t"+sfee);
		break;
	case 2:
		CorporateBatch cb=new CorporateBatch();

		cb.setSid(100);
		cb.setSname("ram");
		cb.setSmobile(7306044998l);
		cb.setSadd("hyderabad");
		cb.setScourse(".net");
	  double sufee=cb.calculatefee(cb.getScourse());
		System.out.println(cb.getSid()+"\t"+cb.getSname()+"\t"+cb.getSmobile()+"\t"+cb.getSadd()+"\t"+cb.getScourse()+"\t"+sufee);
		break;
	case 3:
		WeekendBatch wb=new WeekendBatch();
		wb.setSid(100);
		wb.setSname("honey");
		wb.setSmobile(7306044998l);
		wb.setSadd("hyderabad");
		wb.setScourse("python");
	  double stufee=wb.calculatefee(wb.getScourse());
		System.out.println(wb.getSid()+"\t"+wb.getSname()+"\t"+wb.getSmobile()+"\t"+wb.getSadd()+"\t"+wb.getScourse()+"\t"+stufee);
		break;
	case 4:
		System.exit(0);
		System.out.println("thanks");
		break;
		default:
			System.out.println("enter choice between 1 and 4");
			break;
	}
}
	}

}
