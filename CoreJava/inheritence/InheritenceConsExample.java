package inheritence;
class Demo{
	private int a;
	Demo(){
		System.out.println("Demo Constrcutor");
	}
	Demo(int a){
		//this();//Demo()
		this.a=a;
	}
}

public class InheritenceConsExample extends Demo{
	private String name;
	public InheritenceConsExample() {
		
		System.out.println("InheritenceConsExample Constructor");
	}
	
public InheritenceConsExample(int a, String name) {
	
	super(a);
	//this();//call InheritenceConsExample()
	this.name=name;
		
}

	public static void main(String[] args) {
		InheritenceConsExample ins= new InheritenceConsExample(5,"Jyoti");
		

	}

}
