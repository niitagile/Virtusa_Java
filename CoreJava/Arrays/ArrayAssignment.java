package Arrays;

public class ArrayAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr[]={4,5,-6,8,9,-3,0};
			int ans[]=new int[arr.length];
			int j=0;
			for(int i=0;i<arr.length;i++){
				if(arr[i]<0){
					ans[j]=arr[i];
					j++;
				}
			}
				for(int i=0;i<arr.length;i++){
					if(arr[i]>=0){
						ans[j]=arr[i];
						j++;
					}	
			}
				for(int i=0;i<ans.length;i++){
					System.out.println(ans[i]);
				}
	}

}
