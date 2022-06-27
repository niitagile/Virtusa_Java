package LambdaExamples;

import java.io.IOException;

/*interface Runnable{
	void run();
	
	
}

*class MyThread implements Runnable{
*
*	void run(){
*
*}
*psvmain(){
*	Thread t=new Thread(new MyThread);
*	t.start();
*}
*/

 
public class Demo1 {
	public static void main(String[] args) {
		Runnable r=()-> {
			for(int i=1;i<5;i++)
				System.out.println(i);
		};
		Thread t=new Thread(r);
		t.start();
	}

}
