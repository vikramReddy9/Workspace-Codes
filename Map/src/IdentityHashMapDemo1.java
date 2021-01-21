import java.util.IdentityHashMap;

public class IdentityHashMapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     /*HashMap hm=new HashMap();
     Integer i1=new Integer(10);
     Integer i2=new Integer(10);//i2.equals(i1){here content is same so it will replace}
     hm.put(i1,"vik");
     hm.put(i2, "sik");
     System.out.println(hm);*/// it will give {10=sik} because duplicate keys are not available
     //internally HashMap works .equals method it checks the content so here it checks i2.equals(i1)--> here 10 is same s0 it will replace vik witk sik
     // but identityHashMap checks the address i.e i2==i1 if both address are same then it wil replace. 
		IdentityHashMap ihm=new IdentityHashMap();
	     Integer i1=new Integer(10);
	     Integer i2=new Integer(10);//i2!=i1
	     Integer i3=100;
	     Integer i4=100;//i4==i3
	     ihm.put(i1,"vik");
	     ihm.put(i2, "sik");
	     ihm.put(i3, "nic");//here it checks i2==i1 so when object is created it is taken as seperate memeory{i2!=i1 but 13==14} so it gives output as 100=dic,10=vik,10=sik
	     ihm.put(i4, "dic");
	     System.out.println(ihm);
	}

}
