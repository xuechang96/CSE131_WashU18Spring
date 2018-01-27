package exercises3;

public class Shuffle {

	public static void main(String[] args) {
		String[] original = { "A", "B", "C", "D",
				"E", "F", "G", "H"
		};

		// print out original array
		for (int i=0; i < original.length; ++i) {
			System.out.println("Original at " + i + " is " + original[i]);
		}
		String[] shuffle=new String[original.length];
		for (int t=original.length-1;t>=0;--t) {
			int c=(int) (Math.random()*(t+1));
			shuffle[t]=original[c];
			for(int j=c;j<shuffle.length-1;++j) {
				original[j]=original[j+1];
			}
		System.out.println("Shuffle at "+t+" is "+shuffle[t]);
		//
		// Follow the instructions on the web page to make a copy of
		// the original array, named shuffled, but with its elements
		// permuted from the original array.  The result is that the
		// shuffled array contains the same strings, but in a randomized
		// order.
		//

	}
	}
	
}