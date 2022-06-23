package multithreading_new;

//Common Resource among all Threads
class Table{
	
	 synchronized void printTable(int n){
		   
		 for(int i=1;i<=5;i++){
		      System.out.println(n*i);
		      try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
	     }
	  
	  
	 }
}

class MyThread3 extends Thread{
	Table T;
	MyThread3(Table T){
		this.T=T;
	}
	public void run(){
		T.printTable(5);
	}
}

class MyThread2 extends Thread{
	Table T;
	MyThread2(Table T){
		this.T=T;
	}
	public void run(){
		T.printTable(10);
	}
}

public class CopyOfBlockSynchronizedDemo{
public static void main(String args[]){
	Table obj = new Table();//only one object
	MyThread3 t1=new MyThread3(obj);
	MyThread2 t2=new MyThread2(obj);
	t1.start();
	t2.start();
}
}