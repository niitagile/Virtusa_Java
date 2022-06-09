package Arrays;

import java.util.Scanner;

public class TwoDArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int values[][]=new int[3][4];
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
