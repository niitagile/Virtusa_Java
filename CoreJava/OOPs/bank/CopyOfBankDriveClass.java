package com.bank;

import java.util.Scanner;

public class CopyOfBankDriveClass {

	public static void main(String[] args) {
		/*BankDetails account1=new BankDetails();
		account1.setAcc_no(101);
		account1.setAcc_name("mohit sharma");
		account1.setBalance(1000);
		BankDetails account2=new BankDetails(102, "Kanisk Dev", 3000);
		
		System.out.println(account1.getAcc_no()+"\t"+account1.getAcc_name()+"\t"+account1.getBalance());
		System.out.println(account2.getAcc_no()+"\t"+account2.getAcc_name()+"\t"+account2.getBalance());*/
		
		
		//Array of Objects
		BankServices service=new BankServices();
		Scanner sc=new Scanner(System.in);
		String choice;
		do{
			int result=service.setNewAccount();
			if(result==1)
				System.out.println("Bank Account created");
			else 
				if(result==-1)
				System.out.println("Limit Extends");
				else
					System.out.println("Some Problem");
				System.out.println("Do you want to enter more records(yes/no");
				choice=sc.next();
		} while (choice.equalsIgnoreCase("yes"));
		
		
		service.display();
		service.withdrawn(101, 2000);
		service.depositeMoney(102, 3000);
		

	}

}
