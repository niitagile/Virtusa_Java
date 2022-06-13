package staitckeyword;

import java.util.Scanner;

public class static_example {
	 int a;
	static int b;
	public void getinfo(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter value");
	a=sc.nextInt();
	System.out.println("Enter value");
	b=sc.nextInt();
	}
	public static void display(){
		//System.out.println("a="+a); //can't use non-static members in static
		System.out.println("b="+b);
	}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			static_example st=new static_example();
			st.getinfo();
			static_example.display();

	}

}
