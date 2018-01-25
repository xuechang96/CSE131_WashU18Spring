package exercises1;

import cse131.ArgsProcessor;

public class Change {

	public static void main(String[] args) {
		//
		// Below, prompt the user to enter a number of pennies
		//
		ArgsProcessor ap=new ArgsProcessor(args);
		int numPennies=ap.nextInt("Starting number of Pennies?");
		int numDollars= numPennies/100;
		int numQuarters=numPennies%100/25;
		int numDimes=numPennies%100%25/10;
		int numNickles=numPennies%100%25%10/5;
		int numpennies=numPennies%100%25%10%5;
		System.out.println("For "+numPennies+" pennies");
		System.out.println(numDollars+" dollars");
		System.out.println(numQuarters+" quarters");
		System.out.println(numDimes+" dimes");
		System.out.println(numNickles+" nickles");
		System.out.println(numpennies+" pennies");
		//
		// Then, compute and print out how many 
		//    dollars, quarters, dimes, nickels, and pennies
		// should be given in exchange for those pennies, so as to
		// minimize the number of coins (see the videos)
		//
	}

}
