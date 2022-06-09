package BasicConcepts;

public class switchstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		
		switch(num){
		case 1: System.out.println("1");
				break;	
		case 2: System.out.println("2");
				break;
		case 3: System.out.println("3");
				break;
		case 4:
		case 5:	
				System.out.println("4");
				break;
		default : System.out.println("put value in between 1-4");
		}
		
		System.out.println("switch ended");

	}

}
