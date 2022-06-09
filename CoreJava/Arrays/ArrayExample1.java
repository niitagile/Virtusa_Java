package Arrays;


public class ArrayExample1 {
    public static void main(String[] args) {
    	//int arr[10] error
    	
        int []arr=new int[10];//initialize with 0
        arr[0]=5;
        arr[5]=10;
        arr[9]=20;
        System.out.println("First "+arr[0]);
        System.out.println("Fourth "+arr[4]);
        System.out.println("Second "+arr[5]);
        System.out.println("Third "+arr[9]);
    }
}
