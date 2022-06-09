package Arrays;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[5];
		/*for(int i=0;i<=arr.length;i++)
			System.out.println(arr[i]);*/
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
		System.out.println("Enter value");
		arr[i]=sc.nextInt();
		
		}
		/* for( datatype_Collection variablename : collectionname){}*/
		for(int val : arr){
			if(val%2==0)
			System.out.println(val + " ");
		}
		

	}

}
