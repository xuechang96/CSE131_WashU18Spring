package exercises2;

import cse131.ArgsProcessor;

public class FeetInches {

	public static void main(String[] args) {
		ArgsProcessor ap=new ArgsProcessor(args);
		int inches=ap.nextInt("the number of inches");
		int Feet=inches/12;
		int Inches=inches%12;
		if (Feet%2==0) {
			System.out.println(Feet+" feet "+Inches+" inches");
		}
		else {
			System.out.println(Feet+" foot "+Inches+" inches");
		}
		
		//
		// Prompt the user for a number of inches
		//
		// Convert that into feet and inches
		//   BUT
		// Be sure to use the singular "foot" or "inch"
		//   where appropriate, as discussed in
		//   the introductory video
		//
		// For example, 61 inches would produce
		//    the output
		//   5 feet and 1 inch
		//

	}

}
