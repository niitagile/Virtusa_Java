package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {
		int arr[]={5,6,7,8};
		for(int val :arr){
			System.out.println(val);
		}
		arr[2]=78;
		/*for(Iterator itr=arr.iterator();itr.hasNext()==true;){
			System.out.println(itr.next());
		}*/
		
		ArrayList<String> list=new ArrayList<>();
		list.add("Heena");
		list.add("Monika");
		list.add("Monica");
		Iterator itr=list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		for(String val : list){
			System.out.println(val);
		}
		

	}

}
