package ControlStatements;

public class continue_example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val=3,ans=0;
		for(int i=1;i<=5;i++){
			if(i==val)
				{
				continue;
		
				}
			ans=ans+i;//1+2+4+5=12

		}
		System.out.println("sum="+ans);
	}

}
