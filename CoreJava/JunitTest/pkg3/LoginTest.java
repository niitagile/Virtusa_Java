package JunitTest.pkg3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoginTest {

	@Test
	public void test() {
		Login obj=new Login();
		assertEquals(false, obj.validate("Anita", "Babita"));
		
	}
	@Test
	public void test1() {
		Login obj=new Login();
		
		assertEquals(true,obj.validate("abc", "xyz"));
	}
}
