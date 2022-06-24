package executorframework;

public class RunnableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Main thread started");
			Runnable task=()->{
				System.out.println("Current thread="+Thread.currentThread().getName());
			};
			
			new Thread(task).start();
	}

}
