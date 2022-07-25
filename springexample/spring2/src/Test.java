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
	
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
	Student obj =(Student) context.getBean("studentbean");
	obj.setName("Manisha");
	obj.displayInfo();
	System.out.println(obj);
	Student obj1 = (Student)context.getBean("studentbean1");
	obj1.setName("Nikita");
	obj1.displayInfo();
	System.out.println(obj1);
	context.close();
}  
}  