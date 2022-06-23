package multithreading_new;
class MyThreads extends Thread{
	
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println(this.getName()+" "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			}
	
}
}
public class MultiThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			MyThreads t1=new MyThreads();
			System.out.println("Thread" +t1.getId()+ "is working");
			t1.start();
			
			MyThreads t2=new MyThreads();
			System.out.println("Thread" +t2.getId()+"is working");
			t2.setPriority(1);
			t2.start();
	}

}
