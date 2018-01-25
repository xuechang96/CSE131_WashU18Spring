package studio2;

public class Pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a=0;
		double b=1.0;
		double t=0.0;
		for (int i=0;i<200000;++i) {
			a=4/b*Math.pow(-1, i);
			b=b+2;
			t=t+a;
		}
		System.out.println(t);
		
		
		int n=1;
		int m=3;
		double s=1;
		int x=1;
		double c=(double)n/m;
		for (int r=0;r<2000000;++r) {
			s=s+c;
			n=n+1;
			m=m+2;
			c=c*n/m;
		}
		System.out.println(s*2);
	}

}
