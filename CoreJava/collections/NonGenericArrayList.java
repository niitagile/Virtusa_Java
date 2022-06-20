package collections;

import java.util.ArrayList;

public class NonGenericArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> obj=new ArrayList<>();
		obj.add(1);
		obj.add("Heena");
		System.out.println((Integer)obj.get(0)+2);
		System.out.println(obj.get(1));

	}

}
