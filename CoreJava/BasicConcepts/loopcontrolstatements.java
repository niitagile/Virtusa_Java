package BasicConcepts;

public class loopcontrolstatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* break- stop loop on bases of 1 condition
		 * continue- skip the current iteration
		 */
		System.out.println("output of I loop");
			int val=3;
		for(int i=1;i<=5;i++){
			if (i==val)
				break;
			System.out.println(i);
		}
		
		System.out.println("output of II loop");
		for(int i=1;i<=5;i++){
			if (i==val)
				continue;
			System.out.println(i);
		}
		
	}

}
