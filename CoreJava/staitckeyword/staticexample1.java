package staitckeyword;

class static_out {
	        static int x;
		int y;
	        void add(int a , int b){//simple method can use both
	            x = a + b;
	           y = x + b;
	        }
	        static void display(){
	        	System.out.println("x="+x);//can't use y as it is not static
	        //System.out.println("y="+y);
	        }
	    }    
	    class staticexample1 {
	        public static void main(String args[])
	        {
	            static_out obj1 = new static_out();
	               
	            
	           obj1.add(7, 8);
	            static_out.display();//static method call with class name
	            
	       }
	   }
