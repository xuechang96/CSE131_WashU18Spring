package arrays;
import cse131.ArgsProcessor;

public class PascalsTriangle {
	
	public static void main(String[] args) {
		
		ArgsProcessor ap=new ArgsProcessor(args);
		int N=ap.nextInt("Number of rows");
		
	
		int[][]a=new int[N][N];
		for(int i=0;i<N;i++) {
			a[i][0]=1;
			for (int j=0;j<N;j++) {
				if(i==j) {
					a[i][j]=1;
				}
				else if(i<j) {
					a[i][j]=0;
				}
			}
		}
		for(int i=2;i<N;i++) {
			for(int j=1;j<i;j++) {
				a[i][j]=a[i-1][j]+a[i-1][j-1];
			}
		}
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(a[i][j]==0) {
					continue;
				}
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
		}
	}

