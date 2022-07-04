package JunitTest.pkg1;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AnnotationsTest {
	private ArrayList testList;
	
	@BeforeClass
	public static void execBeforeClass(){
		
		System.out.println("Before Class");
	}
	@Before
	public void execBeforeEachTest(){
		testList=new ArrayList();
		System.out.println("@Before Test");
	}
	@AfterClass
	public static void execAfterClass(){
		System.out.println("AfterClass");
	}
	@After
	public void execAfterEachTest(){
		testList.clear();
	System.out.println("After Test");	
	}
	@Test
	public void test() {
		testList.add("Sunil");
		assertEquals(1,testList.size());
		System.out.println("Testing");
	}
	@Test
	public void test1(){
		assertTrue(testList.isEmpty());
		System.out.println("Test case 2");
		
		}
	@Ignore
	public static void execIgnore(){
		System.out.println("@Ignore");
	}
}
