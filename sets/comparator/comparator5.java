/**
 * write a program to insert String and StringBuffer objects into the treeset where sorting order in creating length order,if two objects are same
 * legth then consider their alphabetical order.
 * 
 * 
 */

/**
 * 
 * In default natural sorting order the object should be homogeneous and comparable,otherwise we will get RE:classcast Exception.
 * In our own(Customized sorting order) the objects may have homogeneous/heterogeneous and comparable.
 */



import java.util.*;
public class comparator5 {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet(new mycomparator5());
		
		ts.add("a");
		ts.add(new StringBuffer("aa"));
		ts.add("abcd");
		ts.add("bb");
		ts.add(new StringBuffer("c"));
		System.out.println(ts);

	}

}

class mycomparator5 implements Comparator{
	public int compare(Object obj1,Object obj2) {
		String s1=obj1.toString();
		String s2=obj2.toString();
		int i1=s1.length();
		int i2=s2.length();
		
		if(i1<i2)
			return -1;
		else if(i1>i2)
			return +1;
		else
			return s1.compareTo(s2);
	}
}
