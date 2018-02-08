package exercises4;

import cse131.ArgsProcessor;

public class Pitches {

	public static void main(String[] args) {
		// encoding has 0 as concert A
		//    1 would be Bb, just above A
		//   -1 would be Ab, just below A
		ArgsProcessor ap=new ArgsProcessor(args);
		int p=ap.nextInt("Enter an integer representing a pitch.");
		double p7=p+7;
		double f=440.0*Math.pow(2, p/12.0);
		double f7=440.0*Math.pow(2, p7/12.0);
		System.out.println("The pitch is "+p);
		System.out.println("The frequecy is "+f);
		System.out.println("The diatonic fifth "+f7);
		double r=f7/f;
		System.out.println("the ration is "+r);

	}

}
