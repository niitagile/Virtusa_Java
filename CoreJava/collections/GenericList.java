package collections;

import java.util.ArrayList;

public class GenericList {

	public static void main(String[] args) {
		ArrayList<Object> list=new ArrayList<>();
		list.add(45);
		list.add(67.5);
		list.add("Jyoti");
		Object obj=new Object();
		list.add(obj);
		System.out.println(list);

	}

}
