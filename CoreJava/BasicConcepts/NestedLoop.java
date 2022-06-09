package BasicConcepts;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			for(int i=1;i<=3;i++){
				for(int j=1;j<=i;j++){
					System.out.print(j+ " ");
				}
				System.out.println();
			}
	}

}
/* 1
1 2
1 2 3
*/