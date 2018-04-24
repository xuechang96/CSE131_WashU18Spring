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
		double [] xx = new double [N];
		double [] yy = new double [N];
		int n=0;
		while (true) {
			if (n<N) {
				while (StdDraw.mousePressed()) {
					StdDraw.pause(100);
				}
				while (!StdDraw.mousePressed()) {
					StdDraw.pause(100);
				}
				double x=StdDraw.mouseX();
				double y=StdDraw.mouseY();
				//x,y=the location of mouse of x and y.
				StdDraw.setPenColor(Color.BLACK);
				StdDraw.circle(x, y, 0.03);
				StdDraw.setPenColor(Color.WHITE);
				StdDraw.filledCircle(x, y, 0.03);
				StdDraw.setPenColor(Color.BLACK);
				StdDraw.filledCircle(x, y, 0.007);
				yy[n]=y;
				xx[n]=x;
				n++;
			}
			else if (n==N) {
				StdDraw.picture(0.5, 0.5, "images/ken.jpg");
				for (int i=0; i<N; i++) {
					double x=StdDraw.mouseX();
					double y=StdDraw.mouseY();
					x-=xx[i];
					y-=yy[i];
					double dis=Math.sqrt((Math.pow(x, 2)+Math.pow(y, 2)));
					double d =0.01*Math.random()+0.007;
					double sx=x/dis*d;
					double sy=y/dis*d;
					double fx=xx[i]+sx;
					double fy=yy[i]+sy;
					StdDraw.setPenColor(Color.BLACK);
					StdDraw.circle(xx[i], yy[i], 0.03);
					StdDraw.setPenColor(Color.WHITE);
					StdDraw.filledCircle(xx[i],yy[i], 0.03);
					StdDraw.setPenColor(Color.RED);
					StdDraw.filledCircle(fx, fy, 0.008);
				}
				StdDraw.show(150);
			}
		}
	}
}