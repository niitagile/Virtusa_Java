package Abstraction;
abstract class A{
	A(){
		System.out.println("A's Constructor");
	}
}
class B extends A{
	B(){
		System.out.println("B's Constructor");
	}
}
public class ConstructorExample {
public static void main(String[] args) {
	B obj=new B();
}
}
