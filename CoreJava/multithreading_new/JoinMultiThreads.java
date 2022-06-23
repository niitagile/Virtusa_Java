package multithreading_new;
class MyThreadWork extends Thread{
	
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
public class JoinMultiThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			MyThreadWork t1=new MyThreadWork();
			System.out.println("Thread" +t1.getId()+ "is working");
			t1.start();
			
			MyThreadWork t2=new MyThreadWork();
			System.out.println("Thread" +t2.getId()+"is working");
			t2.start();
			try {
				t1.join();
				t2.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}

}
