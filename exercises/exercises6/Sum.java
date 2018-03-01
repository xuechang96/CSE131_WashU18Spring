package exercises6;

public class Sum {

	public static int sum(int n) {		
		if (n>0) {
			return sum(n-1) + n;
		}
		else {
			return 0;
		}	
	}

}
