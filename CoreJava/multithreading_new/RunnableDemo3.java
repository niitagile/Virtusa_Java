package multithreading_new;

class RunnableDemo3  implements Runnable{  
	String name;
	
	  
	public RunnableDemo3(String name) {
		super();
		this.name = name;
	}
	
	//run will be called by start()
	@Override
	public void run(){ 
		 System.out.println(name);
	    System.out.println("My thread is in running state.");  
	  }   
		
	  public static void main(String args[]){  
	     
	     RunnableDemo3 obj2=new RunnableDemo3("thread2");
	     Thread tobj1 =new Thread(obj2); 
	     
	     //Thread tobj=new Thread(new RunnableDemo3("thread2"));
	     
	     tobj1.start();// call thread class start method-- run method
	    tobj1.start();//can't start thread 2 times
	     tobj1.setPriority(7);
	     System.out.println("Main Method");
	 }

	  
	}