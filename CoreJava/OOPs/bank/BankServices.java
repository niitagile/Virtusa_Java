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
	
	// methods
	
		void depositeMoney(int acc_no,float amount){
			BankDetails obj=search(acc_no);
			if(obj!=null){
			obj.setBalance(obj.getBalance()+amount);
			System.out.println("After Deposite balance is "+ obj.getBalance());
			}
			else
				System.out.println("Account doesn't exist");
			
			}
		
		

		void withdrawn(int acc_no,float amount){
			BankDetails obj=search(acc_no);
			if(obj!=null){
			float balance=obj.getBalance();
			if(balance>=amount){
				obj.setBalance(balance-amount);
				
			}
			else 
				System.out.println("Insufficient balance");
			System.out.println("Remaining Balance="+obj.getBalance());
		}
			else
				System.out.println("Account doesn't exist");
		}
		
		private BankDetails search(int acc_no) {
			for(BankDetails obj : acc_holders){
				if(obj.getAcc_no()==acc_no){
					return obj;
				}
			}
				
			return null;
		}
}
