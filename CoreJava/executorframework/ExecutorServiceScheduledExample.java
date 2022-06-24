package executorframework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;;

public class ExecutorServiceScheduledExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main thread started");
		ScheduledExecutorService executors=Executors.newScheduledThreadPool(1);
		//IntStream.range(0,5).forEach(i->executors.schedule(new Task1(),10, TimeUnit.SECONDS));
		for(int i=1;i<=5;i++)
		  	executors.schedule(new Task1(),10, TimeUnit.SECONDS);
		executors.shutdown();
		System.out.println("Main thread completed");
	}

}

class Task1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Current Thread :"+ Thread.currentThread().getName());
		//System.out.println(" Executed at :"+ System.nanoTime()/100000);
	}
	
}