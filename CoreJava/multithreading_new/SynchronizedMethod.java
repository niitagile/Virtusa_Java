package multithreading_new;
class Account { 
	   int balance;
	// if 'synchronized' is removed, outcome unpredictable

	 public synchronized void deposit(int amount ) {
				balance += amount;
	  } 

	   public synchronized void withdraw(int amount ) {
		 		balance -= amount;
	   } 
	   public synchronized void enquire( ) {
		 		System.out.println(balance);
	   }
	}

class MyThread1 implements Runnable  {
	 Account account;
	        public MyThread1 (Account s) {  account = s;}
	        public void run() { account.deposit(1000); }
	} // end class MyThread1

class YourThread implements Runnable  {
	 Account account;
	        public YourThread (Account s) { account = s;}
	        public void run() { account.withdraw(500); }     
	} // end class YourThread

	class HerThread implements Runnable  {
	 Account account;
	        public HerThread (Account s) { account = s; }
	        public void run() {account.enquire(); }
	} // end class HerThread

	class SynchronizedMethod {
        public static void main(String [] args  ) {
            Account accountObject = new Account (); 
            Thread t1 = new Thread(new MyThread1(accountObject));
               Thread t2 = new Thread(new YourThread(accountObject));
               Thread t3 = new Thread(new HerThread(accountObject));

            t1.start();
            t2.start();
            t3.start();

          // DO some other operation

       } // end main()
}   
