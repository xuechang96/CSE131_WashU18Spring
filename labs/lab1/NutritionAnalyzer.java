package lab1;

import cse131.ArgsProcessor;

public class NutritionAnalyzer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		String name=ap.nextString("The name of the food");
		double numCarbs=ap.nextDouble("The number of grams of carbohydrates in this food");
		double numFat=ap.nextDouble("The number of grams of fat in this food");
		double numProtein=ap.nextDouble("The number of grams of protein in this food");
		double numStatedCals=ap.nextDouble("The number of grams of calories stated on this food's label");
		double numCalories1=(double)(Math.round(numCarbs*4*100))/100.0;
		double numCalories2=(double)(Math.round(numFat*9*100))/100.0;
		double numCalories3=(double)(Math.round(numProtein*4*100))/100.0;
		double totalCalories=numCalories1+numCalories2+numCalories3;
		double numunavailableCalories1=totalCalories-numStatedCals;
		double numunavailableCalories=(double)(Math.round(numunavailableCalories1*100))/100.0;
		double numFiber1=numunavailableCalories/4;
		double numFiber=(double)(Math.round(numFiber1*100))/100.0;
		double percentCarbs2=numCalories1/numStatedCals*100;
		double percentCarbs=(double)(Math.round(percentCarbs2*100))/100.0;
		double percentFat2=numCalories2/numStatedCals*100;
		double percentFat=(double)(Math.round(percentFat2*100))/100.0;
		double percentProtein2=numCalories3/numStatedCals*100;
		double percentProtein=(double)(Math.round(percentProtein2*100))/100.0;
		boolean lowCarb=(percentCarbs<=25);
		boolean lowFat=(percentFat<=15);
		double t=Math.random();
		boolean coinEat=(t>0.5);
		System.out.println(name+" has "+numCarbs+" grams of carbohydrates = "+numCalories1+" Calories; "+numFat+" grams of fat = "+numCalories2+" Calories; "+numProtein+" grams of protein = "+numCalories3+" Calories");
		System.out.println("This food is said to have "+numStatedCals+" (available) Calories.");
		System.out.println("With "+numunavailableCalories+" unavailable Calories, this food has "+numFiber+ " grams of fiber");
		System.out.println("Approximately, "+percentCarbs+"% of your food is carbohydrates, "+percentFat+"% of your food is fat, "+percentProtein+"% of your food is protein.");
		System.out.println("This food is acceptable for a low-carb diet? "+lowCarb+" ; This food is acceptable for a low-fat diet? "+lowFat);
		System.out.println("By coin flip, you should eat this food? "+coinEat);
		
		
	}

}
