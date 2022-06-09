package BasicConcepts;

public class TypecastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=9;
		float num2=6.7f;
		float ans=num1+num2;//int+float= float // implict typecasting  float+float=float 9.0f+6.7f=15.7f
		System.out.println("sum="+ans);
		int ans2= (int)(num1+num2);// num1--> float    float+float= float
		System.out.println("sum in integer="+ans2);
		

	}

}
