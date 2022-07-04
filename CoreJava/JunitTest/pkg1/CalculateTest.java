package JunitTest.pkg1;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)

public class CalculateTest {
	private int expected;
	private int first,second;

	
	

	public CalculateTest(int expected, int first, int second) {
		
		this.expected = expected;
		this.first = first;
		this.second = second;
	}
	
	
	@Parameters
	public static Collection addedNumbers(){
		return Arrays.asList(new Integer[][]{
				{3,1,2},{7,3,4},
				{9,4,5},{3,0,5}}
		);
	}
	@Test
	
	public void sum() {
		Addition add=new Addition();
		//System.out.println("parameters:"+first+second);
		assertEquals(expected, add.sum(first,second));
	}

}
