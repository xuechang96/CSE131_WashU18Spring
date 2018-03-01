package exercises6;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {
	//@Test directive below is necessary for the method below it to be run as a unit test
	@Test
	public void test() {
		assertEquals(0, Add.add(0, 0));
		for(int i=0;i<10;i++) {
			assertEquals(i,Add.add(0, i));
			assertEquals(i,Add.add(i, 0));
		}
	}
	@Test
	public void test2()
	{		//
		// write other test cases here:
		//
		for (int i=-100;i<100;i++) {
			for (int j=-100;j<200;j++) {
				assertEquals(i+j,Add.add(i, j));
			}
		}
	}
	@Test
	public void test3() {
		assertEquals(-2,Add.add(-4, 2));
		assertEquals(-2,Add.add(2, -4));
	}

}
