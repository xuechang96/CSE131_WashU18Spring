package lab2;

import cse131.ArgsProcessor;

public class Nim {

	public static void main(String[] args) {
		ArgsProcessor ap=new ArgsProcessor(args);
		int startSticks=ap.nextInt("The number of Sticks");
		
		int s=startSticks;
		int n=0;
		int R=0;
		boolean startword=ap.nextBoolean("Who starts first, human(true) or computer(false)");
		if (startword) {
			n=ap.nextInt("Human starts with");
			if (n!=1&&n!=2) {
			System.out.println("Error");
			System.exit(0);
			}
			else {
			s=s-n;
			System.out.println("Round 0, "+startSticks+" sticks at start, human took "+n+", so "+s+" sticks remain");
			}
			R=R+1;
			
		while (s>0) {
			if (R%2==1) {
				double t=Math.random();
				int m=0;
				if (t<0.5||s==1 ) {
					m=1;
				}
				else {
					m=2;
					}
				System.out.print("Round "+R+", "+s);
				s=s-m;	
				System.out.println(" sticks at start, computer took "+m+", so "+s+" sticks remain");
				R=R+1;
				if (s==0) {
					System.out.println("Computer wins");
				}
			}
				
			else {
				int k=ap.nextInt("How many do you take?");
				if (k!=1&&k!=2) {
					System.out.println("Error");
					System.exit(0);
				}
				if (s==1) {
					if (k!=1) {
					System.out.println("Error");
					System.exit(0);
					}
				}
				System.out.print("Round "+R+", "+s);
				s=s-k;	
				System.out.println(" sticks at start, human took "+k+", so "+s+" sticks remain");
				R=R+1;
				if (s==0) {
					System.out.println("Human wins");
				}
				}
		}
		}
		else {
			double t=Math.random();
			int w=0;
			if (t<0.5 ) {
				w=1;
			}
			else {
				w=2;
				}
			System.out.print("Round "+R+", "+s);
			s=s-w;	
			System.out.println(" sticks at start, computer took "+w+", so "+s+" sticks remain");
			R=R+1;
		}
	
		while (s>0) {
			if (R%2==0) {
				double t=Math.random();
				int m=0;
				if (t<0.5||s==1 ) {
					m=1;
				}
				else {
					m=2;
					}
				System.out.print("Round "+R+", "+s);
				s=s-m;	
				System.out.println(" sticks at start, computer took "+m+", so "+s+" sticks remain");
				R=R+1;
				if (s==0) {
					System.out.println("Computer wins");
				}
			}
				
			else {
				int k=ap.nextInt("How many do you take?");
				if (k!=1&&k!=2) {
					System.out.println("Error");
					System.exit(0);
					}
				if (s==1) {
					if (k!=1) {
					System.out.println("Error");
					System.exit(0);
					}
				System.out.print("Round "+R+", "+s);
				s=s-k;	
				System.out.println(" sticks at start, human took "+k+", so "+s+" sticks remain");
				R=R+1;
				if (s==0) {
					System.out.println("Human wins");
				}
				}
			}	
		}		
	}
}
	


