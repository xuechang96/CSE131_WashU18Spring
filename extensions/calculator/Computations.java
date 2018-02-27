package calculator;

public class Computations {

	/**
	 * Complete the static methods as described on the 
	 * description for this assignment.
	 */
	

	/**Double operators**/
	//Returns the result of adding d1 and d2.
	public static double addDoubles(double d1, double d2) {		
		double s=d1+d2;
		return s;
	}

	//Return the result of subtracting d2 from d1.
	static double subtractDoubles(double d1, double d2) {
		double d=d1-d2;
		return d;
	}

	//Return the result of dividing d1 by d2.
	static double divideDoubles(double d1, double d2) {	
		if(d2==0) {
			int s=0;
			return s;
		}
		else {
			double d;
			d=d1/d2;
			return d;
		}		
	}

	//Return the result of multiplying d1 and d2.
	static double multiplyDoubles(double d1, double d2) {
		double m;
		m=d1*d2;
		return m;
	}



	/**Int operators**/

	//Return the result of adding i1 and i2.
	static int addInts(int i1, int i2) {
		int s;
		s=i1+i2;
		return s;
	}

	//Return the result of subtracting i2 from i1.
	static int subtractInts(int i1, int i2) {
		int d;
		d=i1-i2;
		return d;
	}

	//Return the result of dividing i1 by i2.
	static int divideInts(int i1, int i2) {
		if(i2==0) {
			int s=0;
			return s;
		}
		else {
			int d=i1/i2;
			return d;
		}
	}

	//Return the result of multiplying i1 and i2.
	static int multiplyInts(int i1, int i2) {
		int s;
		s=i1*i2;
		return s;
	}



	/**String operators**/	
	//	//Return the result of concatenating s2 to s1.
	static String concatenate(String s1, String s2) {
		String s;
		s=s1+s2;
		return s;
	}



	/**Boolean operators**/
	//Return the boolean value that results from an AND operation of b1 and b2
	static boolean andBoolean(boolean b1, boolean b2) {
		boolean r;
		r=b1&&b2;
		return r;
	}
	//Return the boolean value that results from an OR operation of b1 and b2
	static boolean orBoolean(boolean b1, boolean b2) {
		boolean r;
		r=b1||b2;
		return r;
	}

	/**Casting to int**/
	static int intToInt(int in) {
		int d=(int) in;
		return d;
	}
	static int doubleToInt(double in) {
		int d=(int) in;
		return d;
	}
	static int stringToInt(String in) {
		throw new UnsupportedOperationException();
	}
	static int booleanToInt(boolean in) {
		throw new UnsupportedOperationException();
	}


	/**Casting to double**/
	static double intToDouble(int in) {
		double d;
		d=(double)in;
		return d;
	}
	static double doubleToDouble(double in) {
		double d;
		d=(double)in;
		return d;
	}
	static double stringToDouble(String in) {
		throw new UnsupportedOperationException();
	}
	static double booleanToDouble(boolean in) {
		throw new UnsupportedOperationException();
	}


	/**Casting to String**/
	static String intToString(int in) {
		String s;
		s="" +in;
		return s;
	}
	static String doubleToString(double in) {
		String s;
		s="" +in;
		return s;
	}
	static String stringToString(String in) {
		String s;
		s="" +in;
		return s;
	}
	static String booleanToString(boolean in) {
		String s;
		s="" +in;
		return s;
	}


	/**Casting to Boolean**/
	static boolean intToBoolean(int in) {
		throw new UnsupportedOperationException();
	}
	static boolean doubleToBoolean(double in) {
		throw new UnsupportedOperationException();
	}
	static boolean stringToBoolean(String in) {
		throw new UnsupportedOperationException();
	}
	static boolean booleanToBoolean(boolean in) {
		boolean b;
		b=in;
		return b;
	}


}
