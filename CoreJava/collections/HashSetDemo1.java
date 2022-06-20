package collections;
//import hasarelation.Subject;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class HashSetDemo1 {
	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		//HashSet created only for the String type values
			
		boolean val = hs.add("one");
		System.out.println(val);
		boolean val2 = hs.add("Two");
		System.out.println(val2);
		boolean val3 = hs.add("three"); 
		System.out.println(val3);
		System.out.println(hs.add("hundred")); 
		System.out.println(hs.add("thirty"));
	//shows a compilation error when we try to add incompatible values	
		/*System.out.println(hs.add(1000));    
		System.out.println(hs.add(12.56f));
		System.out.println("one again "+hs.add("one"));
		System.out.println("Al added "+hs.add(ArrayListDemo1.obj));
		
		Subject sub = new Subject("IT", 90, 3);
		System.out.println("Added student object "+hs.add(sub));
		*/
		System.out.println(hs.size());
		System.out.println(hs);
		System.out.println("=====================");
		Iterator i  =hs.iterator();
		//calling the iterator() on
		//hashset object to obtain the iterator reference
		//which can be used for the navigation 
		
		while(i.hasNext()){   
			//returns a boolean values whether we have more values
			//or not 
			String obj = (String) i.next();
			System.out.println(obj);
			
			
			//when we used the generalized collection, while retrieving
			//the elements we have to explicitly type cast the 
			//Object type values to the required Object type
				
			
			
	
		}
		
	}
}
