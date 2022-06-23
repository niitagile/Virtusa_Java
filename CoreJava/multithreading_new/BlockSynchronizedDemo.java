package multithreading_new;

class Table1{

 synchronized void printTable(int n, Thread t){
   
	
	synchronized (this) {
	
	     for(int i=1;i<=5;i++){
    	 System.out.println("Thread id="+t.getId()+": ");
      System.out.println(n*i);
      try{
       Thread.sleep(400);

      }catch(Exception e){System.out.println(e);}
     }
	 }//First Block end
   
	
		
	synchronized (this) {
     for(int i=1;i<=n;i++){
    	 System.out.print("Thread id="+t.getId()+": ");
    	 System.out.println("Hello");
     }
	}//Second Block End
 
 }
     
}
 
class MyThread5 extends Thread{
	Table1 t;
	MyThread5(Table1 t){
	this.t=t;
	}

	public void run(){
	t.printTable(5,this);
	}

}

class MyThread4 extends Thread{
	Table1 t;
	MyThread4(Table1 t){
	this.t=t;
	}
	public void run(){
	t.printTable(2,this);
	}
}

public class BlockSynchronizedDemo{
public static void main(String args[]){
Table1 obj = new Table1();//only one object
MyThread5 t1=new MyThread5(obj);
MyThread4 t2=new MyThread4(obj);
t1.start();
t2.start();
}
}
