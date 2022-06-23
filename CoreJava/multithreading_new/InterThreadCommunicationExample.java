package multithreading_new;
class ChatBoard{
	boolean flag=false;
	synchronized void printQuestions(String msg) {
		if(flag==true){
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		System.out.println(msg);
		flag=true;
		notify();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	synchronized void printAnswers(String msg){
		if(flag==false){
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		System.out.println(msg);
		flag=false;
		notify();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}	
	
}

class ChaterA extends Thread{
	ChatBoard chat;
	String Questions[]={"Hi Mr B", "How are you", "Where do you put up"};
	ChaterA(ChatBoard chat){
		this.chat=chat;
	}
	public void run(){
		for(int i=0;i<Questions.length;i++){
			chat.printQuestions(Questions[i]);
		}
	}
}

class ChaterB extends Thread{
	ChatBoard chat;
	String Answer[]={"Hello Mr A","I am good", "I am staying in Banglore"};
	ChaterB(ChatBoard chat){
		this.chat=chat;
	}
	
	public void run(){
		for(int i=0;i<Answer.length;i++){
			chat.printAnswers(Answer[i]);
		}
	}
}
public class InterThreadCommunicationExample {

	public static void main(String[] args) {
		ChatBoard chat=new ChatBoard();
		ChaterA obj1=new ChaterA(chat);
		ChaterB obj2=new ChaterB(chat);
		obj1.start();
		obj2.start();
		
	}

}
