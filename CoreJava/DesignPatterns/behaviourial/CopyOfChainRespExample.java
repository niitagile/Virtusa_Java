package Design_pattern.behaviourial;
abstract class AbstractResult {
	   public static int TICK = 3;
	   public static int TOTAL = 2;
	   public static int CHECK = 1;

	   protected int level;

	   //next element in chain or responsibility
	   protected AbstractResult nextLogger;

	   public void setNextLogger(AbstractResult nextLogger){
	      this.nextLogger = nextLogger;
	   }

	   public void logMessage(int level, String message){
	      if(this.level <= level){ 
	         write(message);
	      }
	      if(this.nextLogger !=null){
	         nextLogger.logMessage(level, message);
	      }
	   }

	   abstract protected void write(String message);
		
	}

// Console Logger
class TeacherLogger extends AbstractResult {

	   public TeacherLogger(int level){
	      this.level = level;
	   }

	   @Override
	   protected void write(String message) {		
	      System.out.println("TeacherLogger: " + message);
	   }
	}

//Error Logger
class CheckerLogger extends AbstractResult {

	   public CheckerLogger(int level){
	      this.level = level;
	   }

	   @Override
	   protected void write(String message) {		
	      System.out.println("CheckerLogger " + message);
	   }
	}

//File Logger

class TotalLogger extends AbstractResult {

	   public TotalLogger(int level){
	      this.level = level;
	   }

	   @Override
	   protected void write(String message) {		
	      System.out.println("TotalLogger " + message);
	   }
	}





public class CopyOfChainRespExample {
		private static AbstractResult getChainOfLoggers(){

	      AbstractResult checkerLogger = new CheckerLogger(AbstractResult.CHECK);
	      AbstractResult totlarLogger = new TotalLogger(AbstractResult.TOTAL);
	      AbstractResult teacherLogger = new TeacherLogger(AbstractResult.TICK);

	      teacherLogger.setNextLogger(totlarLogger);
	      totlarLogger.setNextLogger(checkerLogger);

	      return teacherLogger;	
	   }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractResult loggerChain = getChainOfLoggers();

	     /* loggerChain.logMessage(AbstractResult.INFO, 
	         "Teacher Checks.");

	      loggerChain.logMessage(AbstractResult.DEBUG, 
	         "This is an debug level information.");*/

	      loggerChain.logMessage(AbstractResult.TICK, 
	         "Work Done");

	}

}
