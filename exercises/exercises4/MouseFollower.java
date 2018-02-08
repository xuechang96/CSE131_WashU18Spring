package exercises4;

import java.awt.Color;

import cse131.ArgsProcessor;
import sedgewick.StdDraw;

public class MouseFollower {

	public static void main(String[] args) {
		
		ArgsProcessor ap=new ArgsProcessor(args);
		int n=ap.nextInt("How much history?");
		
		double [] histX=new double[n];
		double [] histY=new double [n];
		int cur=0;
		while (true) {
			StdDraw.clear();
			//
			// Render one frame of your animation below here
			//
			double x=StdDraw.mouseX();
			double y=StdDraw.mouseY();
			histX[cur]=x;
			histY[cur]=y;
			cur++;
			if (cur>=n) {
				cur=0;
			}
			int older=cur;
			StdDraw.setPenColor(Color.blue);
			StdDraw.filledCircle(x=histX[older], histY[older], .05);
			StdDraw.show(10);
			//  
			// End of your frame
			//
			// Stdraw.show(..) achieves double buffering and
			//   avoids the tight spinning loop
	
		}

	}

}
