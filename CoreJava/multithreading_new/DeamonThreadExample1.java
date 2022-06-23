 package multithreading_new;
//Deamon thread- low priorty thread which always execute on back side and provide functionality to high prioty thread
public class DeamonThreadExample1 extends Thread{

	   public void run(){  
			
		  // Checking whether the thread is Daemon or not
		  if(Thread.currentThread().isDaemon()){ 
		      System.out.println("Daemon thread executing");  
		  }  
		  else{  
		      System.out.println("user(normal) thread executing");  
	          }  
	   }  
	   public static void main(String[] args){  
		 /* Creating two threads: by default they are 
		  * user threads (non-daemon threads)
		  */
		 DeamonThreadExample1 t1=new DeamonThreadExample1();
		 DeamonThreadExample1 t2=new DeamonThreadExample1();   
				 
		 //Making user thread t1 to Daemon
	        t1.setDaemon(true);
			     
	        //starting both the threads 
	        t1.start(); 
	        t2.start();  
	   } 
}