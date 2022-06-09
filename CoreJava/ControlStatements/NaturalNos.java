package ControlStatements;
public class NaturalNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i =1; i<=10;i++)
		{
			System.out.print(i);
			if(i!=10)
			
				System.out.print("+");
				sum=sum+i;
			
		}
		System.out.println(" = "+sum);
		}
	}


