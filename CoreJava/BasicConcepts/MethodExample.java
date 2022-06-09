package BasicConcepts;

public class MethodExample {

	/*  function/method--block of statements which performs a particular task. take some input and return 1 output 
	 * returntype method(list of arguments) 
	 * {
	 * statements;
	 * return output;
	 * 
	 * }
	 * invoke method
	 * ans=methodname(5);
	 */
	
	static int cube(int num){
		 int ans=num*num*num;
		return ans; 
		 
	 }
	
	static void display(String msg){
		System.out.println(msg);
	}
	
	public static void main(String[] args) {
		int ans=cube(5);//actual argument
		System.out.println("cube of number="+ans);
		
		display("Hello EveryOne!!!");
		

	}

}
