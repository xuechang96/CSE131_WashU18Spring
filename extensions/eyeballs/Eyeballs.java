package eyeballs;

import java.awt.Color;

import sedgewick.StdDraw;
import cse131.ArgsProcessor;

public class Eyeballs {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		StdDraw.picture(0.5, 0.5, "images/ken.jpg");
		int N = ap.nextInt("How many eyeballs?");
		
		double eyes[][]=new double [2][N];
		double m[][]=new double [2][N];
		double d[][]=new double [2][N];
		double dis[]=new double [N];
		double p[][]=new double [2][N];
		
		
		for( int i=0;i<N;i++) {			
			StdDraw.setPenColor(Color.BLACK);
			
		while (!StdDraw.mousePressed()) {
		    // do nothing, 
		    // we are waiting for the mouse button to go down  
		    //
		    // The line below is important, as described below
		    //
		    StdDraw.show(50);
		}
		eyes[0][i]=StdDraw.mouseX();
		eyes[1][i]=StdDraw.mouseY();
		StdDraw.circle(eyes[0][i], eyes[1][i], 0.04);
		StdDraw.setPenColor(Color.red);
		StdDraw.filledCircle(eyes[0][i],eyes[1][i],0.01);
		}
	while(true) {			
			StdDraw.clear();
			StdDraw.picture(0.5, 0.5, "images/ken.jpg");
			for(int i=0;i<N;i++) {
				StdDraw.setPenColor(Color.black);
				StdDraw.circle(eyes[0][i], eyes[1][i], 0.04);
			}
			for( int i=0;i<N;i++) {					
				m[0][i]=StdDraw.mouseX();
				m[1][i]=StdDraw.mouseY();
				d[0][i]=m[0][i]-eyes[0][i];
				d[1][i]=m[1][i]-eyes[1][i];
				dis[i]=Math.pow((Math.pow(d[0][i], 2)+Math.pow(d[1][i], 2)),.5);
				double r=0.03/dis[i];
				p[0][i]=eyes[0][i]+d[0][i]*r;
				p[1][i]=eyes[1][i]+d[1][i]*r;				
				StdDraw.setPenColor(Color.red);
				StdDraw.filledCircle(p[0][i],p[1][i],0.01);
				StdDraw.show(10);
		}	
		}
	}
}

