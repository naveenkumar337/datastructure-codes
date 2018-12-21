package programmes;
import java.util.*;
public class treemap {

	public static void main(String[] args) {
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		tm.put(1,"mango");
		tm.put(6,"banana");
		tm.put(5,"orange");
		tm.put(2,"phinapple");
		tm.put(4,"chocolate");
		tm.put(3,"apple");
		tm.put(7,"straberry");
		System.out.println(tm);
		
		TreeMap mtm=new TreeMap(tm);
		
		mtm.put(4,"choco");
		System.out.println(mtm);
		mtm.put(8,"bbbb");
		mtm.put(9,"aaaa");
		mtm.put(10,"oooo");
		mtm.put(11,"SSSS");
		System.out.println(mtm);
		
		
		TreeMap tms=new TreeMap(new myComparator()) ;
		tms.put(1, "XXX");
		tms.put(2, "YYY");
		tms.put(3,"ZZZ");
		tms.put(4, "AAA");
		System.out.println(tms);

	}
	

}
 abstract  class myComparator implements Comparator {
	public int   Compare (Object obj1,Object obj2) {
		String s1=obj1.toString();
		String s2=obj2.toString();
		return s2.compareTo(s1);
		
		
	}
	
}

