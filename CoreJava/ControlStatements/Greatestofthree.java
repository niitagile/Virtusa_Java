package ControlStatements;


public class Greatestofthree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=12,b=5,c=8;
		if(a>b & a>c)
		{
			System.out.println("Greatest "+a);
		}
		else
			System.out.println("Lowest "+a);
		if(b>a & b>c)
		{
			System.out.println("Greatest "+b);
		}
		else
			System.out.println("Lowest "+b);
		if(c>a & b<c)
		{
			System.out.println("Greatest "+c);
		}
		else
			System.out.println("Lowest "+c);
	}

}
