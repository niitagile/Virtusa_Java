package LambdaExamples;

import java.util.function.BiConsumer;
/*interface BiConsumer<T,U>{
	void accept(T t, U u);
}*/
public class BiConsumerExample {
	static void showDetails(String name, Integer age){
		System.out.println(name+" "+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*use of BiConsumer with static method*/
		BiConsumer<String,Integer>biCon=BiConsumerExample::showDetails;
		biCon.accept("Neha",20);
		biCon.accept("Nisha",23);
		
		/*use of BiConsumer interface
		 * BiConsumer<String, Integer> biCon2= (name,age)->System.out.println(name+" "+age);
		
		biCon2.accept("Ashish",20);
		biCon2.accept("Nishant",23);*/

	}

}
