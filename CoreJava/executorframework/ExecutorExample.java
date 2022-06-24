package executorframework;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
 class ExampleCallable implements Callable {

	  private final String name;
	  private final int len;
	  private int sum = 0;

	  public ExampleCallable(String name, int len) {
	    this.name = name;
	    this.len = len;
	  }

	  @Override
	  public String call() throws Exception {
	    for (int i = 0; i < len; i++) {
	      //System.out.println(name + ":" + i);
	      sum += i;
	    }
	    return "sum: " + sum;
	  }
	}

public class ExecutorExample {
	public static void main(String[] args) {

		  ExecutorService es = Executors.newFixedThreadPool(2);
		  Future<String> f1 = es.submit(new ExampleCallable("one",10));
		  Future<String> f2 = es.submit(new ExampleCallable("two",20));

		  try {
		    es.shutdown();
		    es.awaitTermination(5, TimeUnit.SECONDS);
		    //String result1 = f1.get();
		    System.out.println("Result of one: " + f1.get());
		    //String result2 = f2.get();
		    System.out.println("Result of two: " + f2.get());
		  } catch (ExecutionException | InterruptedException ex) {
		    System.out.println("Exception: " + ex);
		  }

		}

}
