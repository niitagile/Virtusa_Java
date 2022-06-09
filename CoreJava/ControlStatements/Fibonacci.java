package ControlStatements;
import java.util.Scanner;


public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int f = sc.nextInt();
		int l = sc.nextInt();
		int p =0, n=1, s=0;
		p=f;
		for(int i=f;i<l;i++)
		{
			s = p+n;//1+1=2  1+2=3 
			if(s<l)
			System.out.print(s+" ");// 2 3
			p=n;//p=1 2
			n=s;//n=1 3
		}
	}

}
