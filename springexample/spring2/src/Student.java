import org.springframework.beans.factory.DisposableBean;

public class Student implements DisposableBean {  
private String name;  
  
public String getName() {  
    return name;  
}  
  
public void setName(String name) {  
    this.name = name;  
}  
  
	public void displayInfo(){  
    System.out.println("Hello: "+name);  
	}
    public void init_perform(){
    	System.out.println("Bean is initialize");
    }

    @Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("bean is destoryed ");
		
	} 
    

	 
}  