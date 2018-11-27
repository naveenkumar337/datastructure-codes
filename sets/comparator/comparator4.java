import java.util.*;
public class comparator4 {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet(new mycomparator4());
		//ts.add(new StringBuffer("naveen"));
		ts.add(new StringBuffer("lokesh"));
		ts.add(new StringBuffer("anil"));
		ts.add(new StringBuffer("ajay"));
		ts.add(new StringBuffer("raju"));
		ts.add(new StringBuffer("veeresh"));
		System.out.println(ts);

	}

}
class mycomparator4 implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		String s1=obj1.toString();
		String s2=obj1.toString();
		
		//return s2.compareTo(s1);
		return s1.compareTo(s2);
		//return 0;
	}
	
}
