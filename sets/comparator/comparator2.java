
import java.util.*;
public class comparator2 {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet(new mycomparator1());
		ts.add(0);
		ts.add(10);
		ts.add(5);
		ts.add(15);
		ts.add(20);
		ts.add(20);
		System.out.println(ts);
		

	}

}

class mycomparator1 implements Comparator{
	public int compare(Object obj1,Object obj2) {
		
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
		
		//it returns ascending order
				//return i1.compareTo(i2);
		//descending order
				//return i2.compareTo(i1);
		
		//it returns descending order
				//return -i1.compareTo(i2);
		
		//returns ascending order
				//return -i2.compareTo(i1);
		
		//it returns first implemented element
				return 0;
		

	}
}

	