package executorframework;

//Here is a class with a method that sets up a ScheduledExecutorService to beep every ten seconds for an hour:
	 
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;



class WorkerThread implements Runnable{
private String command;

    public WorkerThread(String s){
        this.command=s;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" Start. Time = "+new Date());
        processCommand();
        System.out.println(Thread.currentThread().getName()+" End. Time = "+new Date());
    }
    private void processCommand() {
        try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override
    public String toString(){
        return this.command;
    }
}
public class ScheduledExecutorExample {

	public static void main(String[] args) throws InterruptedException {
		ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
	
		//schedule to run after sometime
		System.out.println("Current Time = "+new Date());
		for(int i=0; i<3; i++){
			Thread.sleep(1000);
			WorkerThread worker = new WorkerThread("do heavy processing");
			scheduledThreadPool.schedule(worker, 10, TimeUnit.SECONDS);
			
		}
		
		//add some delay to let some threads spawn by scheduler
		Thread.sleep(30000);
		
		scheduledThreadPool.shutdown();
		while(!scheduledThreadPool.isTerminated()){
			//wait for all tasks to finish
		}
		System.out.println("Finished all threads");
	}

}
