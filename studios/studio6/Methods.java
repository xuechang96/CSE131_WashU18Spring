package studio6;

import org.junit.Test;

public class Methods {

	// Your methods go below this line
	@Test
	/**
	 * 
	 * @param n
	 * @return the sum of the positive integers n + (n-2) + (n-4) + ...
	 */
	public static int sumDownBy2(int n) {
		int sum=0;
		if(n<=0) {
			sum=0;			
		}
		else {
			int i=(n+1)/2;			
			for (int s=0;s<i;s++) {
				sum=sum+n-2*s;
			}
		}
		return sum;
	}
	
	/**
	 * 
	 * @param n>0
	 * @return  the sum 1 + 1/2 + 1/3 + ... + 1/(n-1) + 1/n
	 */
	public static double harmonicSum(int n) {
		double sum=0;
		for (int i=0;i<n;i++) {
			sum=sum+(double)1/(i+1);
		}
		return sum;
	}
	
	/**
	 * 
	 * @param j>0
	 * @param k>0
	 * @return the product j*k
	 */
	public static int mult(int j,  int k) {
		int sum=0;
		for (int i=0;i<j;i++) {
			sum=sum+k;
		}
		return sum;
	}
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @return sum of x and y
	 */
	public static int sum(int x, int y) {
		if(y==0) {
			return x;
		}
		else {
			return sum(x+1,y-1);
		}
	}
	
	/**
	 * 
	 * @param n
	 * @return factorial of n
	 */
	public static int fact(int n) {
		if (n==0) {
			return 1;
		}
		else {
			return  n*fact(n-1);
		}
	}
	
	/**
	 * 
	 * @param n
	 * @return whether n is odd 
	 */
	public static boolean isOdd(int n) {
		if (n==0) {
			return false;
		}
		else {
			return !isOdd(n-1);
		}
	}
	
	public static int fib(int n) {
		if (n<=1) {
			return n;
		}
		else {
			return fib(n-1)+fib(n-2);
		}
	}
	
}
