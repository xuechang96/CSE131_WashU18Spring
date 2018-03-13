package arrays;
import cse131.ArgsProcessor;

public class Birthday {
	
	public static void main(String[] args) {
		
		ArgsProcessor ap=new ArgsProcessor(args);
		int N=ap.nextInt("The total number of people");
		int s[][]=new int[2][N];
		//generate original array
		for (int i=0;i<N;i++) {
			s[0][i]=(int)(12*Math.random()+1);
			s[1][i]=(int)(31*Math.random()+1);
		}
		//the fraction of each month
		double r[]=new double[12];
		for (int m=1;m<=12;m++) {
			int a=0;
		for (int i=0;i<N;i++) {		
			if(s[0][i]==m) {
				a=a+1;
			}
		}
			r[m-1]=(double)a/N;
			System.out.println("For month "+m+" , the fraction of people born in that month is "+r[m-1]);
		
	}
		//average month
		double ave=0;
		for (int m=0;m<12;m++) {
			ave=ave+r[m];
		}
		ave=ave/12;
		System.out.println("The average of the 12 values you computed for the above is "+ave);
		//date fraction
		double d[]=new double[31];
		for (int m=1;m<=31;m++) {
			int a=0;
		for (int i=0;i<N;i++) {			
			if(s[1][i]==m) {
				a=a+1;
			}
		}
			d[m-1]=(double)a/N;
			System.out.println("For day "+m+", the fraction of people born on that day, whether in the same or in a different month is "+d[m-1]);	
		}
		//average date
		double aved=0;
		for (int m=0;m<31;m++) {
			aved=aved+d[m];
		}
		aved=aved/31;
		System.out.println("The average of the 31 values you computed for the above is "+aved);
		//same day fraction
		int same[]=new int [1000];
		for(int w=0;w<N;w++) {
			int e=(s[0][w]-1)*31+s[1][w];
			same[e]=same[e]+1;
		}
		int a=0;
		for (int w=0;w<12*31;w++) {
			if(same[w]<=1) {
				continue;
			}
			else {
				a=a+same[w];
			}
		}
		System.out.println("The fraction of people born on exactly the same day is "+(double)a/N);
		
	}
}