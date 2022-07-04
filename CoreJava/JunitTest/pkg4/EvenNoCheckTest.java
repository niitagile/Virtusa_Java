package JunitTest.pkg4;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class EvenNoCheckTest {
	private Integer num;
	private Boolean expResult;
	private EvenNos even;

		@Before
		public void initializer(){
			even=new EvenNos();
			
		}
		// Every time triggers,it will pass arguments
		public EvenNoCheckTest(Integer num, Boolean expResult) {
			
			this.num = num;
			this.expResult = expResult;
		}

		@Parameterized.Parameters
		public static Collection evennos()
		{
			return Arrays.asList(new Object[][]{
					{2, true},
					{6,true},
					{9,false}});
					
		}
	@Test
	public void test() {
		
		
		assertEquals(expResult, even.check(num));
	}

}
