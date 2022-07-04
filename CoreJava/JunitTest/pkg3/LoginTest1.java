package JunitTest.pkg3;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoginTest1 {

	@Test
	public void test2() {
		Login obj=new Login();
		assertEquals(5, obj.calcLength("Babit"));
		
	}


}
