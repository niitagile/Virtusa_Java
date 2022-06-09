package BasicConcepts;

public class inc_dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=8;
		int x;
		//pre increment
		System.out.println("pre increment");
		x=++a;
		System.out.println("x="+x);
		System.out.println("a="+a);
		
		//post increment
		System.out.println("post increment");
		a=8;
		x=a++;
		System.out.println("x="+x);
		System.out.println("a="+a);

	}

}
