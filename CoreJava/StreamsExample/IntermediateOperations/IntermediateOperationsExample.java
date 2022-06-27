package StreamsExample.IntermediateOperations;

import java.util.ArrayList;
import java.util.List;

public class IntermediateOperationsExample {
public static void main(String[] args) {
	List<String> memberNames = new ArrayList<>();
	memberNames.add("Amitabh");
	memberNames.add("Shekhar");
	memberNames.add("Aman");
	memberNames.add("Rahul");
	memberNames.add("Shahrukh");
	memberNames.add("Salman");
	memberNames.add("Yana");
	memberNames.add("Lokesh");
	
	/*memberNames.stream().filter((s) -> s.startsWith("A"))
    					.forEach(System.out::println);*/
	
	//map() intermediate operation converts each element in the stream into another object
	/*memberNames.stream().filter((s) -> s.startsWith("A"))
    .map(String::toUpperCase)
    .forEach(System.out::println);  */ 
	
	memberNames.stream().sorted()
    .map(String::toUpperCase)
    .forEach(System.out::println);
	
	
}
}
