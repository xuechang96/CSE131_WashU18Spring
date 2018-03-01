package exercises6;

public class Add {
	
	//
	// Complete using the formula:
	//   add(x,y) =           x , if y == 0
	//   add(x,y) = add(x+1,y-1), otherwise
	// require y>=0
	public static int addhelper(int x, int y) {
		if(y==0) {
			return x;
		}
		else {
			return addhelper(x+1,y-1);
		}
	}
	
	//
	// Answer in comments below:
	//
	//  For what values of x and y does your method operate correctly?
	//	x=1, y=1
	//  Your answer:
	//  2
	//  Can you complete the following method
	//   so that it calls add but returns the correct answer
	//   for any x and y?
	//  As a hint, consider that  (x+y) = -(-x + -y)
	//
	public static int add(int x, int y) {
		if (y >= 0) {
			return addhelper(x,y);
		}
		else {
			if(x<0) {
				return -addhelper(-x,-y);
			}
			else {
				return addhelper(y,x);
			}
			
		}
	}

}
