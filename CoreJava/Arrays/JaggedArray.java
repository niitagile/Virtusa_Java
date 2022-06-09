package Arrays;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int values[][]=new int[3][];
		values[0]=new int[1];
		values[1]=new int[3];
		values[2]=new int[2];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<values.length;i++)
		{
			for(int col=0;col<values[i].length;col++)
			{
					System.out.println("Enter value");
					values[i][col]=sc.nextInt();
			}
		}
		
		for(int i=0;i<values.length;i++)
		{
			for(int col=0;col<values[i].length;col++)
			{
				System.out.print(values[i][col]+" ");
				
			}
			System.out.println();
		}
	}

}
