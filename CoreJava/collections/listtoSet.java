package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class listtoSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ls=new ArrayList<>();
		ls.add(1);
		ls.add(3);
		ls.add(2);
		ls.add(1);
		ls.add(2);
		ls.add(3);
		System.out.println(ls);
		TreeSet <Integer> set=new TreeSet<>(ls);
		System.out.println(set);
	/*	List<Integer> s=ls.stream().distinct().collect(Collectors.toList());;
		s.forEach(val->System.out.println(val));*/

	}

}
