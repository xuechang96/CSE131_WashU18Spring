package studio1;

import cse131.ArgsProcessor;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		int n1 = ap.nextInt("The first of two integers to be averaged?");
		int n2 = ap.nextInt("The second of two integers to be averaged?");
		double n=(double)(n1+n2)/2;
		System.out.println("Average of "+n1+" and "+n2+" is "+n);

	}

}
