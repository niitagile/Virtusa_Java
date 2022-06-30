package Design_pattern.behaviourial;

import java.util.ArrayList;
/*  Use for message Oriented Applications
 *  Subject – interface or abstract class defining the operations for attaching 
 *  			and de-attaching observers to the subject.
	ConcreteSubject – concrete Subject class. It maintain the state of the object and 
						when a change in the state occurs it notifies the attached Observers.
	Observer – interface or abstract class defining the operations to be used to notify this object.
	ConcreteObserver – concrete Observer implementations.
 * 
 * 
 */
import java.util.List;

// it implements in one-to-one relationship. It notices the changes in one object state and inform other dependencies
//Subject interface
interface Subject 
{
    public void attach(Observer o);
    public void detach(Observer o);
    public void notifyUpdate(Message m);
}
interface Observer 
{
    public void update(Message m);
}

class MessagePublisher implements Subject {
    
    private List<Observer> observers = new ArrayList<>();
 
    @Override
    public void attach(Observer o) {
        observers.add(o);
    }
 
    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }
 
    @Override
    public void notifyUpdate(Message m) {
        for(Observer o: observers) {
            o.update(m);
        }
    }
}

class MessageSubscriberOne implements Observer 
{
    @Override
    public void update(Message m) {
        System.out.println("MessageSubscriberOne :: " + m.getMessageContent());
    }
}

class MessageSubscriberTwo implements Observer 
{
    @Override
    public void update(Message m) {
        System.out.println("MessageSubscriberTwo :: " + m.getMessageContent());
    }
}

class Message 
{
    final String messageContent;
     
    public Message (String m) {
        this.messageContent = m;
    }
 
    public String getMessageContent() {
        return messageContent;
    }
}
public class ObserverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageSubscriberOne s1 = new MessageSubscriberOne();
        MessageSubscriberTwo s2 = new MessageSubscriberTwo();
        MessagePublisher p = new MessagePublisher();
        
        p.attach(s1);
        p.attach(s2);
        
        p.notifyUpdate(new Message("First Message"));
        p.detach(s1);
        p.notifyUpdate(new Message("Second Message"));
        
	}

}
