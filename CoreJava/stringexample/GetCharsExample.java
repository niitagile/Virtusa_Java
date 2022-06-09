package stringexample;

public class GetCharsExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String src=" Hello class! we are@ learning string";
char ans[]=new char[8];
src.getChars(14, 20, ans, 0);
System.out.println(ans);


/*int arr[]=new int[3];
arr[0]=90;
arr[1]=89;
for(int val:arr)
	System.out.println(val);*/
	}

}
