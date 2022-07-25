

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ac.ApplicationConfiguration;
import QualifierExample.*;
public class Test {  
public static void main(String[] args) {  
   System.out.println("Hello");
	ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
	System.out.println(context);
	MessageProcessor obj = (MessageProcessor)context.getBean(MessageProcessor.class);
	System.out.println(obj);
	obj.processMsg("twitter message is sending...");
	
	
	
}  
}  