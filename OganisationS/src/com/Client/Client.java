
package com.Client;
import java.util.Scanner;

import com.bean.AccountDept;
import com.bean.HrDept;
import com.bean.ItDept;
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
while(true)
{
	System.out.println("1)ItDepartment");
	System.out.println("2)HrDepartment");
	System.out.println("3)Exit");
int choice=sc.nextInt();
switch(choice)
{
case 1:
	ItDept Id=new ItDept();
	Id.setEname("vikram");
	Id.setEno(101);
	Id.setErole("developer");
	double sal=Id.caluculateSalary(Id.getErole());
	System.out.println(Id.getEname()+"\t"+Id.getEno()+"\t"+Id.getErole()+"\t"+sal);
	break;
case 2:
	HrDept Hr=new HrDept();
	Hr.setEname("sam");
	Hr.setEno(102);
	Hr.setErole("sr.hr manager");
	double sala=Hr.caluculateSalary(Hr.getErole());
	System.out.println(Hr.getEname()+"\t"+Hr.getEno()+"\t"+Hr.getErole()+"\t"+sala);
	break;
case 3:
	System.exit(0);
	System.out.println("thanks for using this application");
	break;
	default:
		System.out.println("choose in between 1 and 3");
		break;
}
	}

}
}