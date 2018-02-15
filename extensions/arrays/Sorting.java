
package arrays;
import cse131.ArgsProcessor;

public class Sorting {
	
	public static void main(String[] args) {
		ArgsProcessor ap=new ArgsProcessor(args);
		int N=ap.nextInt("The size of the collection");
		if(N<0) {
		 N=ap.nextInt("The size of the collection");
		}
		int []n=new int[N];
		for (int i=0;i<N;i++) {
			n[i]=ap.nextInt("the next number");
			
		}
		int sortCount=0;
		
		for( sortCount=0;sortCount<N;sortCount++) {
			double k=Integer.MAX_VALUE;
		for (int i=sortCount;i<N;i++) {
		if (n[i]<=k) {
			k=n[i];
			n[i]=n[sortCount];
			n[sortCount]=(int)k;
		}
		}
		System.out.println(k);	
		System.out.println(n[sortCount]);
		}
		
		
	
		int s=0;
		for (int i=0;i<N;i++) {
			s=s+n[i];
			System.out.print(n[i]+" ");
		}
		double mean=(double)s/N;
		int min=n[0];
		int  max=n[N-1];
		int range=max-min;
		double median;
		if(N%2==0) {
			median=(n[N/2]+n[N/2-1])/2.0;
		}
		else {
		 median=n[(N-1)/2];
		}
		System.out.println("");
		System.out.println("the mean is: "+mean);
		System.out.println("the median is: "+median);
		System.out.println("the largest number is: "+max);
		System.out.println("the smallest number is: "+min);
		System.out.println("the range is: "+range); 
	}
}
