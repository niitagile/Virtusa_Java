package inheritence;
//Method Overriding-- parent and child both are having same signature methods
class A1{
	public void display(){
		System.out.println("A's Method");
	}
}
class B1 extends A1{
	@Override
	public void display(){
		
		System.out.println("B's Method");
		super.display();
		
	}
}
public class super_example {
	public static void main(String[] args) {
		B1 b=new B1();
		b.display();
	}

}
