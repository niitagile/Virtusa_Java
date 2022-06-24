package executorframework;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class ExampleCallable1 implements Callable {

	  private final String name;
	  

	  public ExampleCallable1(String name) {
	    this.name = name;
	   
	  }


	  @Override
	  public String call() throws Exception {
	    
	    return name.toUpperCase();
	  }

	 
	}
class ExampleCallable2 implements Callable {

	  private final String name;
	  

	  public ExampleCallable2(String name) {
	    this.name = name;
	   
	  }

	  @Override
	  public Integer call() throws Exception {
		  int sum=0;
		  char arr[]=name.toCharArray();
		  for(int i=0;i<arr.length;i++){
			  if(Character.isAlphabetic(arr[i]))
				  	sum++;
		  }
	    return sum;
	  }
	}
public class ThreadTaskPassing {
	public static void main(String[] args) {

		  
		  try {
			  ExecutorService es = Executors.newFixedThreadPool(2);
			  Future<String> f1 = es.submit(new ExampleCallable1("He12llo"));
			  System.out.println("Upper String : "+ f1.get());
			  Future<Integer> f2 = es.submit(new ExampleCallable2(f1.get()));

		    es.shutdown();
		    es.awaitTermination(5, TimeUnit.SECONDS);
		    
		    System.out.println("No of Alphabets " + f2.get());
		  } catch (ExecutionException | InterruptedException ex) {
		    System.out.println("Exception: " + ex);
		  }

		}

}

