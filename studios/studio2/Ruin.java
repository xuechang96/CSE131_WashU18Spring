package studio2;

import cse131.ArgsProcessor;

public class Ruin {

	public static void main(String[] args) {
		
		ArgsProcessor ap=new ArgsProcessor(args);
		double startAmount=ap.nextDouble("The amount of money that you start with");
		double winChance=ap.nextDouble("The probability that you win a gamble");
		double winAmount=ap.nextDouble("If you reach this amount of money, then you won");
		int totalPlays=ap.nextInt("The number of times you simulate the problem");
		double lossChance=1-winChance;
		double Ruin =0;
		
		if (lossChance != winChance) {
			 Ruin =(Math.pow (lossChance/winChance,startAmount) - Math.pow(lossChance/winChance,winAmount)) / (1 -Math.pow(lossChance/winChance,winAmount)) ;
		}
		else {
			Ruin = 1 - startAmount / winAmount;
		}
		int l=0;
		for (int i=1;i<=totalPlays;++i) {
			
			int R=0;
			double initialAmount=startAmount;
           
            while(initialAmount>0 && initialAmount<winAmount) {
            	 double x=Math.random();
            	if (x<winChance) {
            		initialAmount=initialAmount+1;
            		R=R+1;	
            	}
            	else {
            		initialAmount=initialAmount-1;
            		R=R+1;	
            	}
            }
            
            if (initialAmount==0) {
            	l=l+1;
            	System.out.println("Simulation "+i+" : "+R+" rounds "+"    "+"LOOSE");
            }
            else {
            	System.out.println("Simulation "+i+" : "+R+" rounds "+"    "+"WIN");
            }           	

	}
		System.out.println("Losses "+l+" Simulations "+totalPlays);
		double a=(double)l/totalPlays;
		
		System.out.println("Actual Ruin Rate "+a+"     Expected Ruin Rate "+Ruin);



	}
}
