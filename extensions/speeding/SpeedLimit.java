package speeding;

import cse131.ArgsProcessor;

public class SpeedLimit {

	public static void main(String[] args) {
		ArgsProcessor ap=new ArgsProcessor(args);
		int v=ap.nextInt("The speed of you (MPH)");
		int l=ap.nextInt("The limit of the road (MPH)");
		System.out.println("You reported a speed of "+v+" MPH for a speed limit of "+l+" MPH");
		String r=(v-l>10)?( "Your fine is $"+(10*(v-l-10)+50)+"."):("Your fine is $50.");
		String r1=(v>l)?("You went "+(v-l)+" MPH over the speed limit.  "+r):("No fine.");
		
		System.out.println(r1);
			
	}
}