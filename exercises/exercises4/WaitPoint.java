package exercises4;

import java.awt.Color;

import sedgewick.StdDraw;

public class WaitPoint {

	public static void main(String[] args) {
		
		// wait for the mouse to be pressed and released
		while (!StdDraw.mousePressed()) {	
			StdDraw.pause(100);
		}
		System.out.println("is Pressed");
		// here, the mouse has been pressed
		while(StdDraw.mousePressed()) {
			StdDraw.pause(100);
		}
		// here the mouse is released
		System.out.println("is Released");

		double x=StdDraw.mouseX();
		double y=StdDraw.mouseY();
		// draw a point at the location of the mouse
		StdDraw.setPenColor(Color.blue);
		StdDraw.setPenRadius(0.05);
		StdDraw.point(x,y);
		while(!StdDraw.hasNextKeyTyped()) {
			//do nothing
		}
		if (StdDraw.nextKeyTyped()=='q') {
			StdDraw.text(0.5, 0.5,"good bye!");
		}
		// here, a q has been typed
		
		
		

	}

}
