package BasicConcepts;

import java.util.Scanner;

public class charInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter gender(m/f)");
		char gender=sc.next().charAt(0);
		System.out.println(gender);

	}

}
