package exercises2;

public class RandomAverages {

	public static void main(String[] args) {
		//
		// Write a loop that computes the average
		//     of 1, 2, ... 1000 doubles
		// In each iteration of that loop, print
		//     the average of the doubles generated
		//     thus far.
		//
		// Your code goes below here.
		int t=1;
		double sum=0.0;
		while (t<1001) {
			sum=sum+Math.random();
			double b=sum/t;
			System.out.println("Average of "+t+" numbers is "+b);
			t=t+1;
		}
		
		
		//
		//  Some questions:
		//    1) How does the average change as your loop progresses?
		//    2) Can you write code in your loop that prints out the average only
		//         every 100 iterations, instead of each iteration?
		//
		
	}

}
