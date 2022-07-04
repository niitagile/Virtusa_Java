package JunitTest.pkg1;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdditionTest {

	Addition s=new Addition();
	@Test 
	public void test() {
		
		
		assertEquals(2,s.divide(5, 2));
		
		
	}
	@Test (expected=ArithmeticException.class)
	public void test1(){
		
		
				assertEquals(0,s.divide(5, 0));
	}

}
