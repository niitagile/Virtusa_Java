package LambdaExamples;

import java.util.function.Predicate;
/*interface Predicate<T>{
 boolean test(T t);
}*/
public class PredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> pr = a -> (a > 18); // Creating predicate  
        System.out.println(pr.test(10));    // Calling Predicate method  
	}

}
