package ControlStatements;

import java.util.Scanner;


public class SumofsquareNatural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int sum=0;
		System.out.println("start");
		for(int i=1; i<=10; i++)
		{
			sum=sum+(i*i);
		}
		System.out.println(sum);*/
	
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter limit");
	int limit = sc.nextInt();
	int x;
	int sum =0;
	for(int i =1; i <= limit ; i++){
			x = i*i;
	    
	    sum = sum + x;
	    }
	System.out.println(sum);
	

	}
}
