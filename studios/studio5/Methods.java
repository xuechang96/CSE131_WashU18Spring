package studio5;

public class Methods {
	
	/**
	 * Implemented correctly
	 * @param x one thing to add
	 * @param y the other thing to add
	 * @return the sum
	 */
	public static int sum(int x, int y) {
		return x+y;
	}
	
	/**
	 * 
	 * @param x one factor
	 * @param y another factor
	 * @return the product of the factors
	 */
	public static int mpy(int x, int y) {
		return x*y;  // FIXME
	}
	
	public static double  avg3(int x,int y,int z) {
		return sum(sum(x,y),z)/3;
	}

	public static double sumArray(double[] array) {
		double a=0;
		for (int i=0;i<array.length;i++) {
			a=a+array[i];
		}
		return a;
	}
	public static double average(double[] array) {
		return sumArray(array)/array.length;
	}
	public static int power(int a, int b) {
		int c=1;
		for (int i=0;i<b;i++) {
			c=c*a;
		}
		return c;
	}
	public static String pig(String a) {
		return a.substring(1,a.length())+a.substring(0,1)+"ay";
	}
}
