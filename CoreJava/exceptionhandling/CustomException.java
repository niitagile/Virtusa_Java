package exceptionhandling;

import java.util.Scanner;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String str){
		super(str);
	}
}
public class CustomException {
	static void  validate(int age)throws InvalidAgeException{
		if(age<18){
			throw new InvalidAgeException("you are not eligible for vote");
		}
		else
			System.out.println("welcome to vote");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter your age");
			validate(scan.nextInt());
		}
		catch(InvalidAgeException e){
			e.printStackTrace();
		}

	}

}
