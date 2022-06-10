package com.bank;

import java.util.Scanner;

public class BankServices {

	BankDetails acc_holders[]=new BankDetails[10];
	static int i=0;
	public int setNewAccount(){
		Scanner sc=new Scanner(System.in);
		
			if(i>acc_holders.length){
				return -1;
			}
			System.out.println("Enter account number, name and balance");
				acc_holders[i]=new BankDetails();
				acc_holders[i].setAcc_no(sc.nextInt());
				sc.nextLine();
				acc_holders[i].setAcc_name(sc.nextLine());
				acc_holders[i].setBalance(sc.nextFloat());
				//acc_holders[i]=new BankDetails(sc.nextInt(),sc.nextLine(),sc.nextLine(),sc.nextFloat);
				i++;
		return 1;		
	}
	
	void display(){
		for(BankDetails obj : acc_holders){
			if(obj!=null){
				System.out.println(obj.getAcc_no()+"\t"+obj.getAcc_name()+"\t"+obj.getBalance());
			}
			
		}
	}
	
}
