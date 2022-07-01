package Design_pattern.behaviourial;
interface Iterator {
	   public boolean hasNext();
	   public Object next();
	}
interface Container {
	   public Iterator getIterator();
	}

class NameRepository implements Container {
	   public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

	   @Override
	   public Iterator getIterator() {
	      return new NameIterator();
	   }
	   private class NameIterator implements Iterator {

		      int index;

		      @Override
		      public boolean hasNext() {
		      
		         if(index < names.length){
		            return true;
		         }
		         return false;
		      }

		      @Override
		      public Object next() {
		      
		         if(this.hasNext()){
		            return names[index++];
		         }
		         return null;
		      }		
		   }//inner class end	   
	   
	   
}	   


public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NameRepository namesRepository = new NameRepository();

	      Iterator iter = namesRepository.getIterator(); 
	    while(  iter.hasNext()){
	         String name = (String)iter.next();
	         System.out.println("Name : " + name);

	}
	}
}

























