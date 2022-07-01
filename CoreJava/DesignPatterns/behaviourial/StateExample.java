package Design_pattern.behaviourial;
interface State {
	   public void doAction(Context context);
	}
class StartState implements State {

	   public void doAction(Context context) {
	      System.out.println("Player is in start state");
	      context.setState(this);	
	   }

	   public String toString(){
	      return "Start State";
	   }
	}
class StopState implements State {

	   public void doAction(Context context) {
	      System.out.println("Player is in stop state");
	      context.setState(this);	
	   }

	   public String toString(){
	      return "Stop State";
	   }
	}
class Context {
	   private State state;

	   public Context(){
	      state = null;
	   }

	   public void setState(State state){
	      this.state = state;		
	   }

	   public State getState(){
	      return state;
	   }
	}
public class StateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Context context = new Context();

	      StartState startState = new StartState();
	      startState.doAction(context);

	      System.out.println(context.getState().toString());

	      StopState stopState = new StopState();
	      stopState.doAction(context);

	      System.out.println(context.getState().toString());

	}

}
