package LambdaExamples;
@FunctionalInterface // which contains only 1 abstract method
interface greeting{
	void greet(String msg);
}

class Test implements greeting{

	@Override
	public void greet(String msg) {
		System.out.println(msg);
		
	}
	
}

class Test1 implements greeting{

	@Override
	public void greet(String msg) {
		System.out.println(msg.toUpperCase());
		
	}
	
}


public class LambdaExample1 {

	public static void main(String[] args) {
		greeting obj= (msg) ->System.out.println(msg);
			
		
		obj.greet("Hello Alll!!!!!");
		
		greeting obj1=(msg) ->System.out.println(msg.toUpperCase());
		obj1.greet("Hello Users");
		

	}

}
