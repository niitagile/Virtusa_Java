package BasicConcepts;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//nested if
		int num1=45;
		if(num1>0){
			if(num1%2==0)
				System.out.println("It is even no");
			
			else
				System.out.println("It is odd number");
		}
		else
			System.out.println("It is -ve or 0 value");

	}

}
