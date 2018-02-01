package speeding;

import cse131.ArgsProcessor;

public class SpeedLimit {

	public static void main(String[] args) {
		ArgsProcessor ap=new ArgsProcessor(args);
		int v=ap.nextInt("The speed of you (MPH)");
		int l=ap.nextInt("The limit of the road (MPH)");
		if (v<l) {
			System.out.println("You reported a speed of "+v+" MPH for a speed limit of "+l+" MPH, no fine!");
		}
		else {
			if (v-l<10){
				System.out.println("You reported a speed of "+v+" MPH for a speed limit of "+l+" MPH. ");	
				System.out.println("You went "+(v-l)+" MPH over the speed limit.");
				System.out.println("Your fine is $50.");
			}
			else {
				int a=v-l-10;
				int f=10*a+50;
				System.out.println("You reported a speed of "+v+" MPH for a speed limit of "+l+" MPH. ");	
				System.out.println("You went "+(v-l)+" MPH over the speed limit.");
				System.out.println("Your fine is $"+f+".");
			}
		}
		
		
		
	}
	

}
