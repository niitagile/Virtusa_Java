package Abstraction;
interface interface2{
	void method3();
}
interface interface1 extends interface2{
	int age=100;
	void method1();
	void method2();
	default void method4(){
		System.out.println("defalut method");
	}
	static void method5(){System.out.println("static method");}
	/*jdk1.9
	private void method6(){}*/
}

class Child implements interface1{

	@Override
	 public void method1() {
		// TODO Auto-generated method stub
		//age=90; error
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
			method4();
			interface1.method5();
	}

	
}
public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//interface1 obj=new interface1();
		interface1 obj=new Child();
		obj.method1();
		obj.method2();
		obj.method3();
		obj.method4();
	}

}
