package lab3;

import cse131.ArgsProcessor;

public class DiceSimulation {

	public static void main(String[] args) {
		
		ArgsProcessor ap=new ArgsProcessor(args);
		int D=ap.nextInt("How many dice will be used in this simulation?");
		int T=ap.nextInt("How many times will the dice be thrown?");
		int[][] contents=new int[D][T];
		int i;
		
		for (int n=0;n<D;++n) {
			System.out.print("Contents: ");
			for(i=0;i<T;++i) {
				contents[n][i]=(int)(Math.random()*6)+1;
				System.out.print(" "+contents[n][i]+" ");
			}
			System.out.println();
		}
		int s=0;
		int s1=0;
		for (int m=0;m<T;++m) {
			for(int l=0;l<D-1;++l) {
				if (contents[l][m]==contents[l+1][m]) {
					s1=s1+1;
				}
			}
			if (s1==D-1) {
				s=s+1;
				}
			else {
				s=s+0;
			}
			s1=0;
		} 
		double s2=(double)s/(double)T;
		System.out.println("The same time is: "+s+", the rate is "+s2);
	
		System.out.print("Sums:     ");
	int [] sum=new int[T];
	for (int a=0;a<T;++a) {	
		for (int b=0;b<D;++b) {	
			sum[a]=sum[a]+contents[b][a];		
		}
		if (sum[a]<10) {
			System.out.print(" "+sum[a]+" ");
		}
		else {
			System.out.print(sum[a]+" ");
	
		}
	}
	System.out.println("");
	System.out.println("Sum    Number of times Sum was seen");
	
	int[] numbers = new int[T];  
    for(int w =0;w< T;w++){  
        numbers[w] = 0;  
    }  
      
    for(int e =0; e<T;e++){  
        int temp = sum[e];  
        numbers[temp]++;  
    }  
  
    for(int t =0;t < numbers.length;t++){  
        if(numbers[t] <= 1){  
            continue;  
        }  
        if (t<10) {
			System.out.println(t + "      " + numbers[t] );
		}
		else {
			System.out.println(t + "     " + numbers[t] );
    }  
}  
	}
}
