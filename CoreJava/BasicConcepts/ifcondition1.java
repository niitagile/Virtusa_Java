package BasicConcepts;

public class ifcondition1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if else if ladder
		int num1=78,num2=56,num3=23;
		if(num1>num2 && num1 > num3){
			System.out.println("num1 is greatest");
		}
		else if(num2>num1 && num2>num3){
			System.out.println("num2 is greatest");
		}
		else
			System.out.println("num3 is greatest");

	}

}
