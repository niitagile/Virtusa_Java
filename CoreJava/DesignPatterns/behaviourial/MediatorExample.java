package Design_pattern.behaviourial;
//use in Executor 
import java.util.Date;
// how a set of objects interact with each other. more concentration on functionality
class ChatRoom {
   public static void showMessage(User user, String message){
      System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
   }
}

class User {
	   private String name;

	   public String getName() {
	      return name;
	   }

	   public void setName(String name) {
	      this.name = name;
	   }

	   public User(String name){
	      this.name  = name;
	   }

	   public void sendMessage(String message){
	      ChatRoom.showMessage(this,message);
	   }
	}
public class MediatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User robert = new User("Robert");
	      User john = new User("John");

	      robert.sendMessage("Hi! John!");
	      john.sendMessage("Hello! Robert!");
	}

}
