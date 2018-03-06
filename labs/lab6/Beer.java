package lab6;

public class Beer {
/**
 * 
 * @param n repeat times of the song 
 * @return n repeat times of the song
 */
	public static String bottlesOfBeer(int n) {
		String r="";
		for (int i=n;i>0;i--) {
			r=r+"\n"+i+" bottles of beer on the wall, "+i+" bottles of beer; you take one down, pass it around, "+(i-1)+" bottles of beer on the wall.";
		}
		return r;
		}			
	
	/**
	 * 
	 * @param n
	 * @return f(x) =    x-10     if x > 100
        				= f(f(x+11))  if x <= 100

	 */
	public static int f(int n) {			
		int r=0;
		if(n>100) {
			r=n-10;
		}
		else {
			r=f(f(n+11));
		}
		return r;
	}
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @return  g(x,y)  = y+1               if x = 0
          = g(x-1,1)          if x > 0 and y = 0
          = g(x-1, g(x, y-1)) if x > 0 and y > 0
	 */
	public static int g(int x,int y) {
		int s=0;
		if(x==0) {
			s=y+1;			
		}
		if(x>0&&y==0) {
			s=g(x-1,1);		
		}
		if(x>0&&y>0) {
			s=g(x-1,g(x,y-1));			
		}
		return s;
	}

	public static void main(String[] args) {
		System.out.println(bottlesOfBeer(7));
		System.out.println(f(99));
		System.out.println(f(87));
		System.out.println(g(1,0));
		System.out.println(g(1,2));
		System.out.println(g(2,2));
	}
}
