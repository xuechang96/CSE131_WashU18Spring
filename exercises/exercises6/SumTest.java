package exercises6;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumTest {
	
	//@Test directive below is necessary for the method below it to be run as a unit test
	@Test
	public void test() {
		assertEquals(0,Sum.sum(0));
		assertEquals(6,Sum.sum(3));
	}

}
