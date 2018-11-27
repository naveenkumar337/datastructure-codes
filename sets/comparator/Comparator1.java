/**
 * write a program to insert integer objects into treeset whre sorting order is descending order.
 * 
 * if we are not passing comparator in treeset insertion,then internally jvm will call compareTo() method which meant for default natural sorting order(ascending order).
 * if passing comparator in treeset insertion,then internally jvm will call compareTo() method which meant for default natural sorting order.(descending order)
 * 
 */



import java.util.*;
public class Comparator1 {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet(new Mycomparator());
		ts.add(0);
		ts.add(10);
		ts.add(5);
		ts.add(15);
		ts.add(20);
		ts.add(20);
		System.out.println(ts);
}


}
//for ascending order
class Mycomparator implements Comparator {
	public int compare(Object obj1,Object obj2) {
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
		if(i1<i2)
			return -1;
		else if(i1>i2)
			return +1;
		else
			return 0;
		
	}
}

//For descendig order
/**
 * 
 class Mycomparator implements Comparator {
	public int compare(Object obj1,Object obj2) {
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
		if(i1<i2)
			return 1;
		else if(i1>i2)
			return -1;
		else
			return 0;
		
	}
}
*/
