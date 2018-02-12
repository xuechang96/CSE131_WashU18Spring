package lab4;

import java.awt.Color;

import cse131.ArgsProcessor;
import sedgewick.StdDraw;

public class BumpingBalls {
	
	public static void main(String[] args) {
		ArgsProcessor ap=new ArgsProcessor(args);
		int n=ap.nextInt("The number of balls");
		int i=ap.nextInt("The number of iterations");
		StdDraw.setPenColor(Color.orange);
		for (int b=1;b<=n;b++) {
		double x= Math.random();
		double y=Math.random();
		StdDraw.filledCircle(x, y, 0.04);
		}
	}

}
