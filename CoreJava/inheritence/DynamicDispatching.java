package inheritence;
//Method Overriding-- parent and child both are having same signature methods
class ParentA{
	public int a=20;
	public void display(){
		System.out.println("A's Method");
	}
}
class ChildA extends ParentA{
	public int a=34;
	@Override
	public void display(){
		
		System.out.println("B's Method");
				
	}
	public void show(){
		System.out.println("show method");
	}
}
public class DynamicDispatching {
	public static void main(String[] args) {
		
		//dynamic dispatching-- means at runtime compiler will check for method binding with class
		ParentA ptr=new ChildA();
		ptr.display();
		//ptr.show();//dynamic dispatching works only on overriden methods
		System.out.println(ptr.a);// variables can't be overriden
	}

}
