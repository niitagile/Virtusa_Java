package exceptionhandling;

public class Example4 {
	static void getInfo()throws ArithmeticException, ArrayIndexOutOfBoundsException{
		System.out.println(5/2);
		int arr[]={7};//arr[0]=7 arr[2]
		System.out.println(arr[0]);
		int num=Integer.parseInt("A101");
	}
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	try{	
	getInfo();
	}
	catch(ArithmeticException|ArrayIndexOutOfBoundsException|NumberFormatException e){
		e.printStackTrace();
	}
		System.out.println("Hello All!!!");
}

}
