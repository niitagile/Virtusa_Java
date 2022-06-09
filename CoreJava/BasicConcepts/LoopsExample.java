package BasicConcepts;

public class LoopsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		
		/*for Loop
		 * for(initial value;codition;changes value){
		 * 	statements
		 * }
		 */
		for(int count=1;count<=5;count++){
			System.out.println("hello");
		}
		
		
		/*while loop- entry control loop
		 * while(condition){
		 * }
		 */
			int i=1;
			while(i<=5){
				System.out.println("Hello");
				i++;
			}
		
		
		/*do..while loop- exit control loop
		 * 	do{
		 * }while(condition);
		 */
			int j=1;
			do{
				
				System.out.println("Hello");
				j++;
			}while(j<=5);
	}

}
