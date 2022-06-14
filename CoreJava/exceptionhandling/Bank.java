package exceptionhandling;
public class Bank extends Exception{
	int bal;

	public int getbal() {
		return bal;
	}

	public void setbal(int bal) {
		this.bal = bal;
	}
	public void withdraw(int a)
	{
		try
		{
			if(a>bal)
			throw new Bank();
		}
		catch(Bank e)
		{
			System.out.println("Balance is insufficient");
		}
	}
	public static void main(String[] args) 
	{
		Bank b = new Bank();
		b.setbal(100);
		System.out.println(b.getbal());
		b.withdraw(120);
	}
}
