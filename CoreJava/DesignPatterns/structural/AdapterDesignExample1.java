package Design_pattern.structural;

import java.util.Scanner;
interface CreditCard{
	public void giveBankDetails();  
    public String getCreditCard();  
}
class BankDetails{  
    private String bankName;  
    private String accHolderName;  
    private long accNumber;  
      
    public String getBankName() {  
        return bankName;  
    }  
    public void setBankName(String bankName) {  
        this.bankName = bankName;  
    }  
    public String getAccHolderName() {  
        return accHolderName;  
    }  
    public void setAccHolderName(String accHolderName) {  
        this.accHolderName = accHolderName;  
    }  
    public long getAccNumber() {  
        return accNumber;  
    }  
    public void setAccNumber(long accNumber) {  
        this.accNumber = accNumber;  
    }  
}// End of the BankDetails class.  


class BankCustomer extends BankDetails implements CreditCard{
	public void giveBankDetails(){
		//Scanner scan=new Scanner(System.in);
		setAccHolderName("Anjali");
		setAccNumber(12345678);
		setBankName("Axis");
		
		
	}

	@Override
	public String getCreditCard() {
		// TODO Auto-generated method stub
		giveBankDetails();
		
		return "You are authenticated for credit card and your bank details are:"+getAccHolderName()+getAccNumber()+getBankName();
	}
	
}
public class AdapterDesignExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCard creditcard=new BankCustomer();
		System.out.println(creditcard.getCreditCard());

	}

}
