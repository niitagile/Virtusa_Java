package Arrays;

import java.util.Scanner;

public class OneDArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float values[]=new float[10];
		for(int i=0;i<values.length;i++)
		{
		System.out.println("Enter value"+i);
		values[i]=sc.nextFloat();
		}
		
		for(int i=0;i<values.length;i++){
			if(values[i]%5==0)
				System.out.println(" "+2*values[i]);
			else
				System.out.println(" "+values[i]/2);
		}
	}

}
