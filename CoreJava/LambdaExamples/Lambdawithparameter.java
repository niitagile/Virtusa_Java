package LambdaExamples;
interface Greet{
	void perform(String name);
}

/*void perform(String name){
 * System.out.println(name);
 }
 */

public class Lambdawithparameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Greet greet=name-> System.out.println(name);
		 
		greet.perform("Heena");
		
		greet= name-> System.out.println(name.toUpperCase());
		greet.perform("Lyna");
	}

}
