/**
 * Write a program to insert string objects into treeset where sorting order print reverse of alphabetical order.
 * toString(): it was used for to convert any datatype(even StringBuffer) to String.
 */


import java.util.*;

public class comparator3 {
	public static void main(String[] args) {
		TreeSet ts=new TreeSet(new mycomparator2());
		ts.add("raj");
		ts.add("ram");
		ts.add("ajay");
		ts.add("vimal");
		ts.add("keshav");
		ts.add("radhika");
		System.out.println(ts);
		

	}

}

class mycomparator2 implements Comparator{
	public int compare(Object obj1,Object obj2) {
		
		String i1=(String)obj1;
		String i2=(String)obj2;
		
		//it returns ascending order
				//return i1.compareTo(i2);
		//descending order
				return i2.compareTo(i1);
		
		//it returns descending order
				//return -i1.compareTo(i2);
		
		//returns ascending order
				//return -i2.compareTo(i1);
		
		//it returns first implemented element
				//return 0;
		

	}
}

	

