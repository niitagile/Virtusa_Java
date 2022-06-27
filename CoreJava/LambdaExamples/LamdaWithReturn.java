package LambdaExamples;

interface Calc{
	public int perform(int a);
}
public class LamdaWithReturn {

	public static void main(String[] args) {
			
		Calc calc=	 a->{
			return a*a;
		};
		
		System.out.println(calc.perform(5));
	
	//Addition
		Calc calc1=	 a->a+a;
		System.out.println(calc1.perform(5));
	
	}

}
