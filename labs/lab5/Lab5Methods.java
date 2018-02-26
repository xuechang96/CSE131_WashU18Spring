package lab5;

public class Lab5Methods {

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

	public static double harmonicSum(int n) {
		double sum=0;
		for (int i=0;i<n;i++) {
			sum=sum+(double)1/(i+1);
		}
		return sum;
	}
	
	public static double geometricSum(int n) {
		double sum=0;
		for (int i=0;i<=n;i++) {
			sum=sum+(double)1/(Math.pow(2, i));
		}
		return sum;
	}
	
	public static int multPos(int j,  int k) {
		int sum=0;
		for (int i=0;i<j;i++) {
			sum=sum+k;
		}
		return sum;
	}
	
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
	public static int expt(int n, int j) {
		int pro=1;
		for (int i=0;i<j;i++) {
			pro=pro*n;
		}
		return pro;
	}
}
