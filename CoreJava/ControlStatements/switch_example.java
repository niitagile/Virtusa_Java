package ControlStatements;

import java.util.Scanner;
/*switch(expression){
 * case val: statements; break;
 * case val: statments; break;
 * default: statements;
 * }
 */
public class switch_example {
	public static void main(String[] args) {
		
		      char grade;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character");
		grade=sc.next().charAt(0);
		      switch(grade)// int, short, char,string,enum
		      {
		         case 'A' :
		            System.out.println("Excellent!"); 
		            break;
		         case 'B' :
		         case 'C' :
		            System.out.println("Well done");
		           break;
		         case 'D' :
		            System.out.println("You passed");
		         case 'F' :
		            System.out.println("Better try again");
		            break;
		         default :
		            System.out.println("Invalid grade");
		      }
		      System.out.println("Your grade is " + grade);
		   }

	}


