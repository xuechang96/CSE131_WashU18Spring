package exercises3;

import cse131.ArgsProcessor;

public class TimesTable {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int N = ap.nextInt("Max value for table?");
		int[] [] words=new int[N+1][N+1];
		System.out.print("   ");
		for (int t=0;t<=N;++t){
			System.out.print("  "+t);
		}
		System.out.println("");
		for (int t=0;t<=N+11;++t){
			System.out.print("-");
		}
		System.out.println("");
		for (int i=0;i<=N;++i){
			System.out.print(i+" | ");
			words[i]=new int[N+1];
			for(int j=0;j<=N;++j) {
				words[i][j]=i*j;
				int word=words[i][j];
				if (word<10) {
					System.out.print(" "+words[i][j]+" ");
				}
				else {
					System.out.print(+words[i][j]+" ");
				}
			}
			System.out.println("");
		//  Table should include rows and columns for 0...N  
		//     making N+1 rows and columns
		
	}
	}

}
