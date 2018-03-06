package lab6;

import java.awt.Color;

import sedgewick.StdDraw;

public class Triangles {

	public static void tri(double llx, double lly, double size) {
		StdDraw.setPenColor(Color.black);
		if (size < .01) {
			return;  // abandon recursion
		}
		StdDraw.line(llx,lly,llx+size,lly);
		StdDraw.line(llx,lly,llx+size/2,lly+size);
		StdDraw.line(llx+size/2,lly+size,llx+size,lly);
		tri(llx,lly,size/2);
		tri(llx+size/4,lly+size/2,size/2);
		tri(llx+size/2,lly,size/2);
		StdDraw.pause(50);
	}
public static void main(String[] args) {
		
		tri(0,0,1);
		StdDraw.show(10);
		tri(0,0,1);
}

}
