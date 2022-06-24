package executorframework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.*;

public class ExceutorServiceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main thread started");
		//ExecutorService executors=Executors.newSingleThreadExecutor();
		
		ExecutorService executors = Executors.newFixedThreadPool(3);
		//IntStream.range(0,10).forEach(i-> executors.execute(new Task()));
		for(int i=1;i<=10;i++)
		  	executors.execute(new Task());
		 
		

	}

}
class Task implements Runnable{
	public void run(){
		System.out.println("Current Thread ="+Thread.currentThread().getName());
	}
}

/*public interface Executor {
void execute(Runnable command);
}*/

/*for(int i=0;i<10;i++){
new task().start();
}
*/

/*
Thread name always follws with pool name
thread nevers gets killed
it always wait for other upcoming tasks
if exception occurs in a task then jvm kills the thread and recreate it to 
process the remaining task
*/