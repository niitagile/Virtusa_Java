package LambdaExamples;
@FunctionalInterface
interface Sayable{
	void say();
}

class MethodRef{
	
	
	public static void display(){
		System.out.println("Hello Everyone");
	}
}
public class LambdaMethods {
	public static void main(String[] args) {
		
		Sayable sayable= MethodRef::display;// put body of display method in say method as botha re having same signature 
											//and display is static method so call it with name of class
		sayable.say();
		
		
	}

}
