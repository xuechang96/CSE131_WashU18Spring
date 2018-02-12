package expectedvalue;

import cse131.ArgsProcessor;

public class Expectedvalue {

	public static void main(String[] args) {
		
		ArgsProcessor ap=new ArgsProcessor(args);
		
		double p=ap.nextDouble("The probability of the game start-up venture succeeding.");
		int g=(int) (190000*p+5000*(1-p));
		int s=(int) (110000+50000*Math.random());
		System.out.println("Gamer: $"+g);
		System.out.println("Programmer: $"+s);
		boolean k=(g>s);
		System.out.println("You should be a gamer and not a programmer? "+k);
		int eug=(int)(3*Math.pow(g, 0.5));
		int eup=(int)(2*Math.pow(s, 0.5));
		boolean c=(eug>eup);
		System.out.println("Gamer utility: "+eug);
		System.out.println("Programmer utility: "+eup);
		System.out.println("You should be a gamer and not a programmer? "+c);
	}

}
