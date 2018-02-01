package exercises4;

import java.awt.Color;

import sedgewick.StdDraw;

public class GraphicsDemo {

	public static void main(String[] args) {
		// blue point (look carefully, will be very small on your screen)
		StdDraw.setPenColor(Color.blue);
		StdDraw.setPenRadius(0.05);
		StdDraw.point(0.9,0.9);
		// larger green point
		StdDraw.setPenColor(Color.green);
		StdDraw.setPenRadius(0.2);
		StdDraw.point(0.5,0.92);
		// unfilled red triangle
		StdDraw.setPenColor(Color.red);
		StdDraw.setPenRadius(0.05);
		StdDraw.line(0,0,0,1);
		StdDraw.line(0, 0, 1, 0);
		StdDraw.line(1,0,0,1);
		// yellow circle, filled
		StdDraw.setPenColor(Color.yellow);
		StdDraw.filledCircle(0.6,0.5,0.3);
		// filled blue rectangle
		StdDraw.setPenColor(new Color(0,0,120));
		StdDraw.filledRectangle(0.25,0.25,0.2,0.1);


	}

}
