package com.bank;

import java.util.Scanner;

public class BankDriveClass {

	public static void main(String[] args) {
		/*BankDetails account1=new BankDetails();
		account1.setAcc_no(101);
		account1.setAcc_name("mohit sharma");
		account1.setBalance(1000);
		BankDetails account2=new BankDetails(102, "Kanisk Dev", 3000);
		
		System.out.println(account1.getAcc_no()+"\t"+account1.getAcc_name()+"\t"+account1.getBalance());
		System.out.println(account2.getAcc_no()+"\t"+account2.getAcc_name()+"\t"+account2.getBalance());*/
		
		
		//Array of Objects
		BankDetails acc_holders[]=new BankDetails[10];
		Scanner sc=new Scanner(System.in);
		int i=0;
		String choice;
		do {
			if(i>acc_holders.length){
				break;
			}
			System.out.println("Enter account number, name and balance");
				acc_holders[i]=new BankDetails();
				acc_holders[i].setAcc_no(sc.nextInt());
				sc.nextLine();
				acc_holders[i].setAcc_name(sc.nextLine());
				acc_holders[i].setBalance(sc.nextFloat());
				//acc_holders[i]=new BankDetails(sc.nextInt(),sc.nextLine(),sc.nextLine(),sc.nextFloat);
				i++;
			
				System.out.println("Do you want to enter more records(yes/no");
				choice=sc.next();
		} while (choice.equalsIgnoreCase("yes"));
		
		
		for(BankDetails obj : acc_holders){
			if(obj!=null){
				System.out.println(obj.getAcc_no()+"\t"+obj.getAcc_name()+"\t"+obj.getBalance());
			}
			
		}
		

	}

}
