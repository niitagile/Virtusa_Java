package exceptionhandling;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			System.out.println(5/0);
			int arr[]={7};//arr[0]=7 arr[2]
			System.out.println(arr[0]);
			int num=Integer.parseInt("A101");
		}
		
			
		catch(ArithmeticException |ArrayIndexOutOfBoundsException|NumberFormatException e){
			e.printStackTrace();
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
