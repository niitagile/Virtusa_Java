package BasicConcepts;

public class ScopeofVariables {
	static	double marks=90.5;	//instance variables
	static void method1(){
		int num=67;
		System.out.println(num);
		System.out.println("marks in method1="+marks);
	}
	static void method2(){
		int num=56;
		System.out.println("value in method2="+num);
		System.out.println("marks in method2="+marks);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			method1();
			method2();
	}

}
