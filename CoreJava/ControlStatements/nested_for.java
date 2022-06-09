package ControlStatements;

public class nested_for {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=3;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i+" "+j+" ");
			}
			System.out.println();
		}

	}

}
