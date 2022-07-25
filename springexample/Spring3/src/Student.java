
public class Student {  
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
public void init(){
	System.out.println("init method");
}
public void destroy(){
	System.out.println("destroy method");
}
}  