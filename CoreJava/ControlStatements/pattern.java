package ControlStatements;
public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =1; i<=5;i++)
		{
			for(int j=1; j<=i; j++)
			{
				char c = (char) (96+j);
				System.out.print(c);
			}
			System.out.println();
		}
	}

}
