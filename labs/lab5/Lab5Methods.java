package lab5;

public class Lab5Methods {

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
	 * @param n>=0
	 * @return the sum 1 + 1/2 + 1/4 + 1/8 + ... + 1/Math.pow(2,n)
	 */
	public static double geometricSum(int n) {
		double sum=0;
		for (int i=0;i<=n;i++) {
			sum=sum+(double)1/(Math.pow(2, i));
		}
		return sum;
	}
	/**
	 * 
	 * @param j>0
	 * @param k>0
	 * @return the product j*k
	 */
	public static int multPos(int j,  int k) {
		int sum=0;
		for (int i=0;i<j;i++) {
			sum=sum+k;
		}
		return sum;
	}
	/**
	 * 
	 * @param j
	 * @param k
	 * @return the product j*k
	 */
	public static int mult(int j,  int k) {
		int sum = 0;
		if(j<0&&k>=0) {
		int m=-j;
		sum=-multPos(m,k);		
		}
		if(k<0&&j>=0) {
			int m=-k;	
			sum=-multPos(j,m);			
		}
		if(j<0&&k<0) {
			int m=-j;
			int n=-k;
			sum=multPos(m,n);			
		}
		if(j>=0&&k>=0) {
			sum=multPos(j,k);
		}
		return sum;
	}
	/**
	 * 
	 * @param n
	 * @param j>=0
	 * @return the value of n to the power j
	 */
	public static int expt(int n, int j) {
		int pro=1;
		for (int i=0;i<j;i++) {
			pro=pro*n;
		}
		return pro;
	}
}
