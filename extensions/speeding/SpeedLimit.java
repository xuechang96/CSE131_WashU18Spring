package speeding;

import cse131.ArgsProcessor;

public class SpeedLimit {

	public static void main(String[] args) {
		ArgsProcessor ap=new ArgsProcessor(args);
		double v=ap.nextDouble("The speed of you");
		int l=ap.nextInt("The limit of the road");
		if (v<l) {
			System.out.println("No fine!");
		}
		else {
			if (v-l<10){
				System.out.println("The fine is $50");	
			}
			else {
				double a=v-l-10;
				double f=10*a+50;
				System.out.println("The fine is $"+f);
			}
		}
		
		
		
	}
	

}
