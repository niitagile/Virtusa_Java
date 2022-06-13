package inheritence;
class ClassA{
	void show(){
		System.out.println("ClassA Method");
	}
	ClassA(){
		System.out.println("ClassA Constructor");
	}
}

class ChildA extends ClassA{
	
	ChildA(){
		super();
		System.out.println("ChildA constructor");
	}
	
	void show(){
		
		System.out.println("ChildA Method");
		super.show();
	}
}
public class SuperExample {

	public static void main(String[] args) {
		

	}

}
