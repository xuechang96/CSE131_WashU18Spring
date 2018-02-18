package lab4;

import java.awt.Color;

import cse131.ArgsProcessor;
import sedgewick.StdDraw;

public class BumpingBalls {
	
	public static void main(String[] args) {
		ArgsProcessor ap=new ArgsProcessor(args);
		StdDraw.setXscale(-2.0, 2.0);
        StdDraw.setYscale(-2.0, 2.0);
		int n=ap.nextInt("The number of balls");
		int i=ap.nextInt("The number of iterations");
	
		double[]rx=new double[n];
		double[]ry=new double[n];
		double[]vx=new double[n];
		double[]vy=new double[n];
		double radius=0.1;
		for (int b=0;b<n;b++) {
			 rx[b]= Math.random();
			 ry[b]=Math.random();
			 vx[b]=Math.random()*0.1;
			 vy[b]=Math.random()*0.1;
			
		}
			for (int c=0;c<i;c++) {
		    StdDraw.clear();
			 for (int b=0;b<n;b++)  {
	            // bounce off wall according to law of elastic collision
	            if (Math.abs(rx[b] + vx[b]) > 2.0 - radius) vx[b]=-vx[b];
	            if (Math.abs(ry[b] + vy[b]) > 2.0 - radius) vy[b]=-vy[b];
	            if(Math.abs(rx[b])>2) rx[b]=Math.random()*2-1;
	            if(Math.abs(rx[b])>2) rx[b]=Math.random()*2-1;
	            
	            for(int a=0;a<n;a++) {
	            	if (a!=b) {
	            		if(Math.pow(Math.pow(rx[b]-rx[a],2)+Math.pow(ry[b]-ry[a],2),0.5)<=0.2) {
	            			vx[b]=-vx[b];	    
	            			vy[b]=-vy[b];	            			
	            		}	            		
	            	}
	            }

	            // update position
	            rx[b] = rx[b] + vx[b]; 
	            ry[b] = ry[b] + vy[b];     

	            // draw ball on the screen
	            StdDraw.setPenColor(Color.blue);

	            // display and pause for 20 ms
	            StdDraw.filledCircle(rx[b], ry[b], radius); 	             
	        } 			
			 StdDraw.show(30);
		     // clear the background
	      
		}
	}
	}



