package exceptionhandling;

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			try{
				System.out.println(5/0);
			}
			catch(ArithmeticException e){
				e.printStackTrace();
			}
			finally{
				System.out.println("End of program");
			}
			System.out.println("Hello All!!!");
	}

}
