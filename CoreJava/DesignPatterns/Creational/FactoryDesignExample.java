package Design_pattern.Creational;
import java.io.*;      
//define an interface or abstract class for creating an object but let the subclasses decide which class to instantiate.
//loose coupling
//also called virtual construtor
abstract class Plan{  
         protected double rate;  
         abstract void getRate();  
   
         public void calculateBill(int units){  
              System.out.println(units*rate);  
          }  
}//end of Plan class.

class  DomesticPlan extends Plan{  
    //@override  
     public void getRate(){  
         rate=3.50;              
    }  
}//end of DomesticPlan class. 

class  CommercialPlan extends Plan{  
	   //@override   
	    public void getRate(){   
	        rate=7.50;  
	   }   
	//end of CommercialPlan class.  
}

class GetPlanFactory{  
    
	   //use getPlan method to get object of type Plan   
	       public Plan getPlan(String planType){  
	            if(planType == null){  
	             return null;  
	            }  
	          if(planType.equalsIgnoreCase("DOMESTICPLAN")) {  
	                 return new DomesticPlan();  
	               }   
	           else if(planType.equalsIgnoreCase("COMMERCIALPLAN")){  
	                return new CommercialPlan();  
	            }   
	          
	      return null;  
	   }  
	}//end of GetPlanFactory class.  
public class FactoryDesignExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetPlanFactory plan=new GetPlanFactory();
		Plan obj=plan.getPlan("Domesticplan");
		obj.getRate();
		obj.calculateBill(300);
		
	}

}
