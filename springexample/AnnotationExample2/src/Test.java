import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource; 
import org.springframework.context.support.ClassPathXmlApplicationContext;
  
public class Test {  
public static void main(String[] args) {  
   
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
	Writer obj = (Writer)context.getBean("writer");
	obj.getAward();
	
	
	context.close();
}  
}  