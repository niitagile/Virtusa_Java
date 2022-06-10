package Classes;

public class BankDetails {
	
	//variables
	private int acc_no;
	private String acc_name;
	private float balance;

	
	//getter methods
	int getAcc_no(){
		return this.acc_no;// this indicates to current object
	}
	
	String getAcc_name(){
		return this.acc_name;
	}
	
	public float getBalance() {
		return this.balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	//setter methods
	void setAcc_no(int acc_no){
		this.acc_no=acc_no; //when local variable name and instance variable name, use this keyword to indicate instatnce variable name
	}
	
	void setAcc_name(String acc_name){
		this.acc_name=acc_name;
	}
	
	
	//constrcutor
	
	public BankDetails(){
		acc_no=0;
		acc_name=null;
		balance=0.0f;
	}

	public BankDetails(int acc_no, String acc_name, float balance) {
		
		this.acc_no = acc_no;
		this.acc_name = acc_name;
		this.balance = balance;
	}
	
	// methods
	
	void depositeMoney(float amount){
		this.balance+=amount;
		System.out.println("After Deposite balance is "+ getBalance());
	}
	
	void withdrawn(float amount){
		
		if(this.balance>=amount){
			this.balance-=amount;
			
		}
		else 
			System.out.println("Insufficient balance");
		System.out.println("Remaining Balance="+getBalance());
	}
}
