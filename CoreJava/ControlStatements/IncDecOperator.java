package ControlStatements;

public class IncDecOperator {

	public static void main(String[] args) {
		
		int a=5;
			int x=++a;//a=a+1--> 5+1=6--> a=6    x=6
			System.out.println(	"a="+a+" x="+x);
			
			x=a++;//x=a x=6 a=a+1--> 6+1=7
			System.out.println(	"a="+a+" x="+x);
	}

}
