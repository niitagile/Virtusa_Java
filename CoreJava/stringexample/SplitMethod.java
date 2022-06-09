package stringexample;

public class SplitMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello Class we !are learning string";
		String ans[]=s.split("!");
		for(String val: ans){
			System.out.println(val);
		}
/*for enhanced syntax
 * for(datatye variablename: arrayname)
 * {
 * }
 */
	}

}
