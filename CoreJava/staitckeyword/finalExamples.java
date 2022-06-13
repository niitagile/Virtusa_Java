package staitckeyword;
/* declare class as final
 * create all fields as private
 * don't provide setters
 * declare all fields as final 
 * initialize all values through constructor
 */
final class Test{
	private final String username;
	Test(String username){
		this.username=username;
		
	}
	public String getUsername() {
		return username;
	}
	
	
}
//class Java extends Test{}
public class finalExamples {
	public static void main(String[] args) {
		Test t=new Test("Mahesh");
		System.out.println(t.getUsername());
		t=new Test("Vinisha");
		System.out.println(t.getUsername());
	}
	

}
