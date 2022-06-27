package LambdaExamples;
/*Rules for Lambda
 * interface contains only 1 abstract method
 * create reference object of interface
 *don't give signature of method
*/
@FunctionalInterface
interface interface1{
	void show();
}
/*class Test implements interface1{

	@Override
	public void show() {
		
		System.out.println("Hello ALL!!!");
	}
	
}*/
public class LamdaDemo1 {

	public static void main(String[] args) {
		
		interface1 obj=()->	System.out.println("Hello All!!!!");
				
		obj.show();
		
		
		
		
		
		
		
		
		
	}

}
