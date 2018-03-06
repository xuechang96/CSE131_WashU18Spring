package lab6;

import static org.junit.Assert.*;


public class Methods {
	
	//
	// In this class, implement the f and g functions described on the lab page
	//

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//
		// from here, call f or g with the appropriate parameters
		//		
		assertEquals(Beer.f(99),Beer.f(100));
		assertEquals(Beer.f(99),Beer.f(87));
		

	}

}
