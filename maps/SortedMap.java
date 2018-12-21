package programmes;
import java.util.*;
public class treemap {

	public static void main(String[] args) {
		SortedMap<Integer,String> tm=new TreeMap<Integer,String>();
		tm.put(1,"mango");
		tm.put(6,"banana");
		tm.put(5,"orange");
		tm.put(2,"phinapple");
		tm.put(4,"chocolate");
		tm.put(3,"apple");
		tm.put(7,"straberry");
		System.out.println(tm.entrySet());
		
		System.out.println("first key :"+tm.firstKey());
		System.out.println("last key :"+tm.lastKey());
		System.out.println("head map :"+tm.headMap(3));
		System.out.println("tail map :"+tm.tailMap(3));
		System.out.println("sub map :"+tm.subMap(3,6));
		System.out.println("check comparator  map :"+tm.comparator());
		
			}
	

}
 
