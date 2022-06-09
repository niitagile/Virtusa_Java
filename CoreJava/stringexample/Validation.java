package stringexample;

import java.util.Scanner;

public class Validation {
public boolean validate(String userid, String passwd){
	if(userid.equalsIgnoreCase("Java11") && passwd.equals("eclipse@123"))
		return true;
	else
		return false;
}
public static void main(String args[]){
	Validation obj=new Validation();
	int i=1;
	Scanner sc=new Scanner(System.in);
	do{
	System.out.println("Enter UserId");
		String userid=sc.nextLine();
	System.out.println("Enter password");
	String passwd=sc.nextLine();
	
	if(obj.validate(userid.trim(), passwd.trim())){
		System.out.println("Welcome");
		break;
	}
	else
	{
			if(i!=3)
		System.out.println("Enter correct userid and password");
			
	}
	i++;
	}while(i<=3);
}
}
