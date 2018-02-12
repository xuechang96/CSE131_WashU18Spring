package baseball;

import cse131.ArgsProcessor;

public class BaseballStats {

	public static void main(String[] args) {
		
		ArgsProcessor ap = new ArgsProcessor(args);

		String name=ap.nextString("The name of the player");
		int at=ap.nextInt("The number of at-bats the player");
		int hit=ap.nextInt("The number of hits the player has had provided as an int");
		double ba=Math.round((double)hit/at*1000)/1000.0;
		System.out.println("Matt Carpenter "+ba);
		boolean a=(at>200&&ba>=0.27);
		System.out.println("All-Star Worthy? "+a);
		
	}

}
