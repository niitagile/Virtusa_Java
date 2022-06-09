package BasicConcepts;

public class Calculator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=7;
		int num2=3;
		int num3=9;
		/*int q=num1/num2;
		int r=num1%num2;
		System.out.println("q="+q);
		System.out.println("r="+r);
		System.out.println(num1>num2);*/
		
		System.out.println(num1>num2 && num3<num2);// 7> 3 and 9<3
		System.out.println(num1>num2 || num3<num2);// 7> 3 or 9<3
		System.out.println(!(num1>num2)); //(7>3)  -- !true-- false
	}

}
