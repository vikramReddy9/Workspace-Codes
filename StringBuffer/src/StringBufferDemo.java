
public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// usage ---> If the data is keep on changing we can use StringBuffer(SB) instead of Strings
//	SB represents a group of characters, each and every character will be represented based on index value 
// Initial capacity 16 to increase the capacity{(Current capacity+1)*2}
//predefined constructors----->
//1)StringBuffer2)SB(String str,int capacity)
// methods---->
//1)length()---> to know the length of the SB
//2)capacity()---> to know the capacity of SB(size of the SB)
//3)append()---> using this we can add any type of information{primitive DataTypes,Strings,array,object}
//4)ensure capacity(int capacity)---> if you want to set the capacity.
//5)trimtoSize()--->if you want to remove the extra allocated size.
//6) insert(int index,char ch)---> if you want to insert character based on index.
//7)insert(String str,char ch)---> if you want to insert string.
//8)delete(int startindex,int endindex)---->if you want to delete particular things based on index.
//9)SB methods are synchronized methods.
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("star");
		System.out.println(sb.capacity());
		System.out.println(sb);
		sb.append("vikram is always better than siddartha");
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.ensureCapacity(2000);
		}

}
