package onerepmax;

import cse131.ArgsProcessor;

public class OneRepMax {


	public static void main(String[] args) {
		ArgsProcessor ap=new ArgsProcessor(args);
		int w=ap.nextInt("Successful Weight (pounds)");
		int r=ap.nextInt("Successful reps");
		int d=ap.nextInt("Desired reps");
		int r1=(int)(Math.round(w*(1+r/30.0)));
		int wd=(int)(Math.round(r1/(1+d/30.0)));
		System.out.println("One-rep max: "+r1);
		System.out.println("Weight for "+d+" reps: "+wd);
		System.out.println("95% 1 RM: "+(int)(r1*0.95));
		System.out.println("90% 1 RM: "+(int)(r1*0.90));
		System.out.println("85% 1 RM: "+(int)(r1*0.85));
		System.out.println("80% 1 RM: "+(int)(r1*0.80));
		System.out.println("75% 1 RM: "+(int)(r1*0.75));
		System.out.println("70% 1 RM: "+(int)(r1*0.70));
		System.out.println("65% 1 RM: "+(int)(r1*0.65));
		System.out.println("60% 1 RM: "+(int)(r1*0.60));
		System.out.println("55% 1 RM: "+(int)(r1*0.55));
		System.out.println("50% 1 RM: "+(int)(r1*0.50));
	
	}

}
