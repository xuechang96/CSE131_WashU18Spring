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
		for (int n=2;n<N+2;++n) {
			if(n>2&&n%2==0) {
				contents[n-2]=0;
			}
			if(n>3&&n%3==0) {
				contents[n-2]=0;
			}
			if(n>5&&n%5==0) {
				contents[n-2]=0;
			}
			if(n>7&&n%7==0) {
				contents[n-2]=0;
			}
		}
		System.out.print("Primes under "+(N+2)+" is: ");
		for (int n=0;n<N;++n) {
		if (contents[n]!=0) {
			System.out.print(contents[n]+" ");
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