package exceptionhandling;

public class Example3 {
		static void getInfo(){
			System.out.println(5/2);
			int arr[]={7};//arr[0]=7 arr[2]
			System.out.println(arr[2]);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{	
		getInfo();
		}
		catch(ArithmeticException|ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}
			System.out.println("Hello All!!!");
	}

}
