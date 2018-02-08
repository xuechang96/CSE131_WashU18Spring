package studio4;

import java.awt.Color;

import cse131.ArgsProcessor;
import sedgewick.StdAudio;
import sedgewick.StdDraw;
import sedgewick.StdIn;

public class Flag {

	
	public static void main(String[] args) {
		//
		//  Add code for your studio below here.
		//
	
		while (true) {	
			
		for (double i=0.01;i<=1.4;i=i+0.25) {
		StdDraw.setPenColor(Color.red);
		StdDraw.filledRectangle(0.5, 0.5, 1, 1);
		StdDraw.setPenColor(new Color(0,150,150));
		StdDraw.filledCircle(0.7, 0.5, 0.05);
		StdDraw.filledCircle(0.9, 0.5, 0.05);
		StdDraw.setPenColor(Color.green);
		double []x= {0,0,0.4};
		double []y= {0,1,0.5};
		StdDraw.filledPolygon(x,y);
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.text(i, 1-i, "Country");
		StdDraw.show(500);
		if (i>=1.3) {
			i=0;
			}
		StdDraw.clear();
			}
		ArgsProcessor.useStdInput("music");
		 while (!StdIn.isEmpty()) {

	            // read in the pitch, where 0 = Concert A (A4)
	            int pitch = StdIn.readInt();

	            // read in duration in seconds
	            double duration = StdIn.readDouble();

	            // build sine wave with desired frequency
	            double hz = 440 * Math.pow(2, pitch / 12.0);
	            int N = (int) (StdAudio.SAMPLE_RATE * duration);
	            double[] a = new double[N+1];
	            for (int i = 0; i <= N; i++) {
	                a[i] = Math.sin(2 * Math.PI * i * hz / StdAudio.SAMPLE_RATE);
	            }

	            // play it using standard audio
	            StdAudio.play(a);
	        }
		
		}
		
	}
	

}
