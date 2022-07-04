package JunitTest.pkg1;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertionsExample {

	@Test
	public void test() {
		String obj1="Amit";
		String obj2="Amit";
		String obj3="test";
		String obj4="test";
		String obj5=null;
		int num1=1;
		int num2=2;
		int arr1[]={1,2,3};
		int arr2[]={1,2,3};
		
		assertEquals(obj1,obj2);
		assertSame(obj3,obj4);
		assertNotSame(obj2,obj3);
		assertNotNull(obj1);
		assertNull(obj5);
		assertTrue(num1< num2);
		assertArrayEquals(arr1,arr2);
		
	}

}
