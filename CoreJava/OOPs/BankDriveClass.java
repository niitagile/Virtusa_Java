package Classes;

public class BankDriveClass {

	public static void main(String[] args) {
		BankDetails account1=new BankDetails();
		account1.setAcc_no(101);
		account1.setAcc_name("mohit sharma");
		account1.setBalance(1000);
		BankDetails account2=new BankDetails(102, "Kanisk Dev", 3000);
		
		System.out.println(account1.getAcc_no()+"\t"+account1.getAcc_name()+"\t"+account1.getBalance());
		System.out.println(account2.getAcc_no()+"\t"+account2.getAcc_name()+"\t"+account2.getBalance());

	}

}
