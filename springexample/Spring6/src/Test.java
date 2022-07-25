import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource; 
import org.springframework.context.support.ClassPathXmlApplicationContext;
  
public class Test {  
public static void main(String[] args) {  
   
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
	Questions obj = (Questions)context.getBean("ques1");
	//Questions obj=context.getBean(Qusetions.class);
	obj.display();
	
	
	context.close();
}  
}  