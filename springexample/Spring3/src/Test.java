import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource; 
import org.springframework.context.support.ClassPathXmlApplicationContext;
  
public class Test {  
public static void main(String[] args) {  
    /*Resource resource=new ClassPathResource("application.xml");  
    BeanFactory factory=new XmlBeanFactory(resource);  
      
    Student student=(Student)factory.getBean("studentbean");  
    student.displayInfo();  */
	//API which takes care of bean creation
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
	Student obj = context.getBean(Student.class);
	obj.displayInfo();
	context.registerShutdownHook();
	context.close();
}  
}  