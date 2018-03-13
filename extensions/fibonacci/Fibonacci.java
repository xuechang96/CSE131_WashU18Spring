package fibonacci;

public class Fibonacci {
	
	/**
	 * Below copy your solution to recursive Fibonacci from studio
	 * @param n
	 * @return fib(n), computed recursively
	 */
	public static int recursive(int n) {
		if (n<=1) {
			return n;
		}
		else {
			return recursive(n-1)+recursive(n-2);
		}
	}
	
	/**
	 * Below write your solution to Fibonacci, using iteration
	 * @param n
	 * @return fib(n), computed iteratively
	 */
	public static int iterative(int n) {
		int s=0;
		if (n<=1) {
			return n;
		}
		else {	
			int a=iterative(0);
			int b=iterative(1);
			for(int i=0;i<n-1;i++) {		
				s= a+b;	
				a= b;
				b= s;									
			}			
		}
		return s;
	}

}
