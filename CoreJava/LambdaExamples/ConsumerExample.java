package LambdaExamples;


import java.util.function.Consumer;
/*interface Consumer<T>{
	void accept(T t);
}*/
public class ConsumerExample {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//injecting of already existing method
		
		//create new body for method
		Consumer<String> biCon2= (name)->System.out.println(name);
		
		biCon2.accept("Ashish");
		biCon2.accept("Nishant");

	}

}

