package LambdaExamples;
interface Calculator{
	int calc(int a, int b);
}
interface display{
	void show();
}
public class LambdaAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
		Calculator obj=(a,b)->{
			if(b!=0)
				return a/b;
			else
				return 0;
		};
		
		System.out.println(obj.calc(5, 3));
		
		
		Calculator obj1=(a,b)-> a+b;
		System.out.println(obj1.calc(4,6));
		
		display d= ()-> System.out.println("Hello");
		d.show();
	}

}
