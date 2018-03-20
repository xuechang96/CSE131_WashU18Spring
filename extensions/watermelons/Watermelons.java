package watermelons;

import java.util.Arrays;

import sun.security.util.Length;

public class Watermelons {
	
	/**
	 * Computes the sum of each distinct pair of entries in the incoming array.
	 * A given pair of entries has its sum computed only once.  So if you
	 * compute the sum for entries 2 and 4, and that sum appears in your answer
	 * array, then you do not also compute the sum of entries 4 and 2.
	 * Depending on the input, the same sum value may appear multiple times in the result.
	 * For example, if all of the incoming values are 0, then so are all of the returned values.
	 * @param nums an array of integers, possibly containing duplicates
	 * @return an array containing the sums of pairs as described above
	 */
	public static int[] allPairSums(int[] nums) {
		int[] ans = new int[(nums.length-1)*nums.length/2];  // FIXME compute ans as the result you want
		int s=0;
		int a=0;
		for(s=0;s<nums.length-1;s++) {					
			for(int i=s+1;i<=nums.length-1;i++) {
				ans[a]=nums[s]+nums[i];
				a=a+1;		
			}
		}
		return ans;
	}
	
	

	/**
	 * The method below must COMPUTE and return a solution as described
	 * on the web page for this extension.  
	 * 
	 * You must compute the solution by trying
	 * lots of possibilities, and finding the one that yields the right answer.
	 * 
	 * You can run the provided unit test to see if you are right.
	 * @param pairSums is array of watermelon pairwise sums.  In other words,
	 *    each element of pairSums represents the sum of one pair of watermelons in our puzzle.
	 * @return
	 */
	public static int[] getSolution(int[] pairSums) {
		int []f=new int [5];
		for(int a=1;a<25;a++) {
			for(int b=1;b<25;b++) {
				for(int c=1;c<25;c++) {
					for(int d=1;d<25;d++) {
						for(int e=1;e<25;e++) {
							int []n={e,d,c,b,a};
							if(sameIntArrays(allPairSums(n),pairSums)) {
								f=n;
							}
						}
					}
				}
			}
		}
		return f;
	}
	
	/**
	 * Compare two arrays for equality.  They must first be
	 * sorted, so that Arrays.equals can do its thing element
	 * by element, as is it wants.
	 * 
	 * However, what if the caller doesn't want the arrays to
	 * be disturbed?  We therefore clone the arrays (copies are
	 * made of them) before we do the compare, and we compare the
	 * clones.
	 * @param one: an array, not mutated
	 * @param two: another array, not mutated
	 * @return true iff the arrays' contents are the same
	 */
	public static boolean sameIntArrays(int[] one, int[] two) {
		int[] cone = (int[]) one.clone();
		int[] ctwo = (int[]) two.clone();
		Arrays.sort(cone);
		Arrays.sort(ctwo);
		return Arrays.equals(cone, ctwo);
	}


}
