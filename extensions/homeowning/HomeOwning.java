package homeowning;

import cse131.ArgsProcessor;

public class HomeOwning {

	public static void main(String[] args) {
	
	ArgsProcessor ap=new ArgsProcessor(args);
	String name=ap.nextString("The name of the apartment complex");
	int code=ap.nextInt("The zip code of the apartment");
	int rent=ap.nextInt("The monthly rent of the apartment");
	double interest=ap.nextDouble("The daily interest payment for your mortgage on the house");

	double wrent=Math.round((double)rent/31.0*7*100)/100.0;
	System.out.println(name+" is located in the Zip Code "+code);
	System.out.println("The rent for a year: "+12*rent);
	System.out.println("The rent for a week: "+ wrent);
	System.out.println("The interest payment for a year: "+Math.round(interest*365*100)/100.0);
	System.out.println("The interest payment for a week:" +Math.round(interest*7*100)/100.0);
	boolean d=((12*rent)>(interest*365));
	if (d==true) {
	System.out.println("I should rent");
	}
	else {
		System.out.println("I should own");
	}
	int rent1=980;
	boolean d1=((12*rent1)>(interest*365));
	if (d1==true) {
	System.out.println("If the rent is 980 per month, I should rent");
	}
	else {
		System.out.println("If the rent is 980 per month, I should own");
	}
	}

}
