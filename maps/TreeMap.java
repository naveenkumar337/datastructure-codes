package programmes;
import java.util.*;
import java.util.Map.Entry;

class Book{
	int id;
	String name;
	public Book(int id,String name) {
		this.id=id;
		this.name=name;
	}
}
public class LinkedHashmap {

	public static void main(String[] args) {

	
		TreeMap<Integer,String> lhm=new TreeMap<Integer,String>();
		lhm.put(121,"naveen");
		lhm.put(122,"nmango");
		lhm.put(127,"govind");
		lhm.put(123,"nepal");
		lhm.put(125,"orange");
		lhm.put(126,"banana");
		lhm.put(124,"siva");
		//lhm.put(128,12345);
		
		 for(Map.Entry m:lhm.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      }  
		 
		 //print at descending order
		 System.out.println("descending order:"+lhm.descendingMap());
		//head map list
		 System.out.println("Head map:"+lhm.headMap(123));
		 
		 //tail map list
		 System.out.println("Tail map:"+lhm.tailMap(123));
		 
		 //submap list
		 System.out.println("sub map:"+lhm.subMap(123, 126));
		
		 
		 
		 
		 //by using functions and methods.
		 TreeMap<Integer,Book> lhm1=new TreeMap<Integer,Book>();
		Book b=new Book(128, "ajay");
		Book b2=new Book(129,"anana");
		
		lhm1.put(1,b);
		lhm1.put(2, b2);
			System.out.println(lhm.entrySet());
		System.out.println(lhm1.entrySet());
		for(Map.Entry<Integer, Book> entry:lhm1.entrySet()){    
	        int key=entry.getKey();  
	        Book b1=entry.getValue();
	        System.out.println(b1.id+"-->"+b1.name);
		}
	}
	
	}


