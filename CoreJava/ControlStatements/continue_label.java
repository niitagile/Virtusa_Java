package ControlStatements;

public class continue_label {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		label:
		for(int i=1;i<=3;i++){
			for(int j=1;j<=3;j++){
				System.out.println(i+""+j+ " ");
				if(i==2)
					continue label;
			}
		}
	}

}
