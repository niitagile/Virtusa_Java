package JunitTest.pkg3;

public class Login {
	 int calcLength(String pword){
		return pword.length();
	}
	public boolean validate(String uname, String pword){
		if(uname.equals("abc") && pword.equals("xyz"))
		return true;
		else
			return false;
	}
	

}
