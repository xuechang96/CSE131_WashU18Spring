package exercises2;

import cse131.ArgsProcessor;

public class Heads {

	public static void main(String[] args) {
		ArgsProcessor ap=new ArgsProcessor(args);
		int t=ap.nextInt("The number of repetation");
    
		double totalFlips=0;
		for (int i=0;i<t;++i) {
    	
			// what are the concepts?
			int numHeads = 0;
			int numFlips = 0;
			
			// now flip a coin until we see 10 heads
			while (numHeads != 10) {
				boolean isHeads = Math.random() < 0.5;
				if (isHeads) {
					numHeads = numHeads + 1;
				}
				numFlips = numFlips + 1;
				
			}
			// here, numHeads should be 10
			totalFlips=totalFlips+numFlips;
			System.out.println("Number of flips was " + numFlips);
			
		
}
			
    double average10Flips=totalFlips/t;
	System.out.println("Average number of flips was "+average10Flips);	

	}

}
