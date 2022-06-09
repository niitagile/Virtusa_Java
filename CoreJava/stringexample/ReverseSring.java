package stringexample;

import java.util.Scanner;

public class ReverseSring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter String");
String str=sc.nextLine();
String ans="";

for(int i=str.length()-1;i>=0;i--){
ans=ans+ str.charAt(i);	
}
System.out.println("Reverse String="+ans);
	
	//2nd way to reverse a string
char arr[]=str.toCharArray();
	  for(int i=str.length()-1;i>=0;i--)
	  {
	  System.out.print(arr[i]);
	  }
	 
	
	}

}
