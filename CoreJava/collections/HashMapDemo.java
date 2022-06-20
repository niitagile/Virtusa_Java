package collections;

import java.util.*;

class HashMapDemo 
{
	public static void main(String[] args) 
	{
		Map<String,Integer> map = new HashMap<String,Integer>();
		System.out.println(args.length);
		for(String str : args)
		{
			Integer i = str.length();
			map.put(str , i);
		}
		
		System.out.println(map.size()+" distinct words");
		System.out.println("Contents of map are "+map);
		for(String s: map.keySet())
		{
			System.out.println("Key: "+s+"\tValue: "+map.get(s));
		}
	
	}
}
