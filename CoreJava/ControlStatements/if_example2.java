package ControlStatements;

import java.util.Scanner;

public class if_example2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		a=sc.nextInt();
		System.out.println("Enter a value");
		b=sc.nextInt();
		System.out.println("Enter a value");
		c=sc.nextInt();
		if(a>b && a>c)
			System.out.println("a is greatest");
		else if(b>a && b>c)
			System.out.println("b is greatest");
		else
			System.out.println("c is greatest");
	}

}
