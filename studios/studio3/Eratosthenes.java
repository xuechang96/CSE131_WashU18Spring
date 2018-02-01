package studio3;

import cse131.ArgsProcessor;

public class Eratosthenes {

	public static void main(String[] args) {
		
		ArgsProcessor ap=new ArgsProcessor(args);
		int N=ap.nextInt("The size n");
		int []contents=new int[N];
		for (int i=0;i<N;++i) {
			contents[i]=i+2;
		}
		for(int a=2;a<N+3;++a) {
			int f=(N+2)/a;
			if(f>=2&&(a*f-2<N)) {
			for (int n=2;n<=f;++n) {
				contents[a*n-2]=0;
			}
			}
		}
			
		System.out.print("Primes under "+(N+2)+" is: ");
		for (int s=0;s<N;++s) {
		if (contents[s]!=0) {
			System.out.print(contents[s]+" ");
		}	
	}
		System.out.println("");
		int A=ap.nextInt("Decide whether the number is a prime number");
		if(A>(N+1)||A<0) {
			System.out.println("Error");
		}
		else {
		if(contents[A-2]==0) {
			System.out.println(A+": this is not a prime number");
		}
		else {
			System.out.println(A+": this is a prime number");
		}
	}
}
}